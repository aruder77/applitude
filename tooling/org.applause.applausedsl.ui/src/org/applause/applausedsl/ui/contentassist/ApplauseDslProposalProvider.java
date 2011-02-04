package org.applause.applausedsl.ui.contentassist;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateProposal;

import com.google.inject.Inject;

/**
 * @see http
 *      ://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 */
public class ApplauseDslProposalProvider extends AbstractApplauseDslProposalProvider {

	private final static Logger log = Logger.getLogger(ApplauseDslProposalProvider.class);

	@Inject
	private IImageHelper imageHelper;

	/**
	 * Indentation code as in DefaultIndentLineAutoEditStrategy
	 */
	public class IndentXtextTemplateContext extends XtextTemplateContext {

		public IndentXtextTemplateContext(TemplateContextType type, IDocument document, Position position,
				ContentAssistContext contentAssistContext, IScopeProvider scopeProvider) {
			super(type, document, position, contentAssistContext, scopeProvider);
		}

		/**
		 * Returns the first offset greater than <code>offset</code> and smaller
		 * than <code>end</code> whose character is not a space or tab
		 * character. If no such offset is found, <code>end</code> is returned.
		 */
		protected int findEndOfWhiteSpace(IDocument document, int offset, int end) throws BadLocationException {
			while (offset < end) {
				char c = document.getChar(offset);
				if (c != ' ' && c != '\t') {
					return offset;
				}
				offset++;
			}
			return end;
		}

		@Override
		public TemplateBuffer evaluate(Template template) throws BadLocationException, TemplateException {
			String pattern = template.getPattern();

			IDocument document = getDocument();
			int offsetCompletion = getCompletionOffset();
			int offsetStartOfLine = document.getLineInformationOfOffset(
					offsetCompletion == document.getLength() ? offsetCompletion - 1 : offsetCompletion).getOffset();
			int offsetEndOfWhitespace = findEndOfWhiteSpace(document, offsetStartOfLine, offsetCompletion);
			String indentString = document.get(offsetStartOfLine, offsetEndOfWhitespace - offsetStartOfLine);

			pattern = pattern.replace("\n", "\n" + indentString);

			Template indentedTemplate = new Template(template.getName(), template.getDescription(),
					template.getContextTypeId(), pattern, template.isAutoInsertable());

			return super.evaluate(indentedTemplate);
		}

	}

	@Override
	public void complete_ImageExpression(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		Resource res = model.eResource();
		URI uri = res.getURI().appendSegment("..").appendSegment("Images");

		String platformResourceString = uri.toPlatformString(true);
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(platformResourceString));
		try {
			IResource[] members = folder.members();
			for (IResource member : members) {
				String proposal = getValueConverter().toString(member.getName(), "STRING");
				ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
				acceptor.accept(completionProposal);
			}
		} catch (CoreException e) {
			log.error(e.getMessage(), e);
		}
	}

	public void completeKeyword(Keyword keyword, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// replace single keyword proposals with complete template snippets
		if (keyword.getValue().equals("cell"))
			completeKeyword("cell", "static cell", context, acceptor);
		else if (keyword.getValue().equals("for"))
			completeKeyword("for", "iterate over collection", context, acceptor);
		else if (keyword.getValue().equals("section"))
			completeKeyword("section", "static section", context, acceptor);
		else if (keyword.getValue().equals("tableview"))
			completeKeyword("tableview", "tableview with section", context, acceptor);
		else
			super.completeKeyword(keyword, context, acceptor);
	}

	private void completeKeyword(String keyword, String description, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		TemplateContextType contextType = new TemplateContextType();
		XtextTemplateContext templateContext = new IndentXtextTemplateContext(contextType, context.getDocument(),
				new Position(context.getReplaceRegion().getOffset(), context.getReplaceRegion().getLength()), context,
				getScopeProvider());

		String templateText = null;
		InputStream templateStream = null;
		try {
			templateStream = this.getClass().getResourceAsStream(keyword + ".txt");
			templateText = IOUtils.toString(templateStream);
		} catch (IOException e) {
			log.error(e);
		} finally {
			IOUtils.closeQuietly(templateStream);
		}

		if (templateText != null) {
			Template template = new Template(keyword, description, "", templateText, true);
			acceptor.accept(new XtextTemplateProposal(template, templateContext, context.getReplaceRegion(),
					imageHelper.getImage(keyword + ".png")));
		}
	}

}
