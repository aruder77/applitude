package org.applause.applausedsl.ui.contentassist;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.applause.applausedsl.ui.utils.IOUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Inject;

/**
 * @see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 */
public class ApplauseDslProposalProvider extends AbstractApplauseDslProposalProvider {

	private final static Logger log = Logger.getLogger(ApplauseDslProposalProvider.class);

	@Inject
	private IImageHelper imageHelper;

	@Inject
	private XtextTemplateContextType templateContextType;

	private static class KeywordProposal {
		String keyword;
		String description;
		Image image;
		String pattern;
	}

	private Multimap<String, KeywordProposal> keywordSnippets;

	private Multimap<String, KeywordProposal> getKeywordSnippets() {
		if (keywordSnippets == null) {
			keywordSnippets = Multimaps.newHashMultimap();
			registerKeywordSnippet("cell", "static cell");
			registerKeywordSnippet("for", "iterate over collection");
			registerKeywordSnippet("section", "static section");
			registerKeywordSnippet("tableview", "tableview with section");
		}
		return keywordSnippets;
	}

	private void registerKeywordSnippet(String keyword, String description) {
		KeywordProposal proposal = new KeywordProposal();
		proposal.keyword = keyword;
		proposal.description = description;
		proposal.image = imageHelper.getImage(keyword + ".png");

		InputStream templateStream = null;
		try {
			templateStream = this.getClass().getResourceAsStream(keyword + ".txt");
			proposal.pattern = IOUtils.toString(templateStream);
		} catch (IOException e) {
			log.error(e);
		} finally {
			IOUtils.closeQuietly(templateStream);
		}

		keywordSnippets.put(keyword, proposal);
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

	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// replace single keyword proposals with complete template snippets
		Collection<KeywordProposal> proposals = getKeywordSnippets().get(keyword.getValue());
		if (!proposals.isEmpty()) {
			for (KeywordProposal proposal : proposals) {
				completeSnippet(proposal, context, acceptor);
			}
		} else {
			super.completeKeyword(keyword, context, acceptor);
		}
	}

	private void completeSnippet(KeywordProposal proposal, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		XtextTemplateContext templateContext = new IndentTemplateContext(templateContextType, context.getDocument(),
				new Position(context.getReplaceRegion().getOffset(), context.getReplaceRegion().getLength()), context,
				getScopeProvider());

		Template template = new Template(proposal.keyword, proposal.description, "", proposal.pattern, true);
		acceptor.accept(new IndentTemplateProposal(template, templateContext, context.getReplaceRegion(), proposal.image, 1000));
	}

}
