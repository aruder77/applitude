package org.applause.applausedsl.ui.contentassist;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;

/**
 * Indentation code as in DefaultIndentLineAutoEditStrategy
 */
public class IndentTemplateContext extends XtextTemplateContext {

	private boolean indent = true;
	
	public IndentTemplateContext(TemplateContextType type, IDocument document, Position position,
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
		if (!isIndent())
			return super.evaluate(template);
		
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

	public boolean isIndent() {
		return indent;
	}

	public void setIndent(boolean indent) {
		this.indent = indent;
	}

}