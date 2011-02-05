package org.applause.applausedsl.ui;

import org.applause.applausedsl.ui.contentassist.ProposalComparator;
import org.applause.applausedsl.ui.wizard.ApplauseDslProjectCreator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ApplauseDslUiModule extends org.applause.applausedsl.ui.AbstractApplauseDslUiModule {

	public ApplauseDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ICompletionProposalComparator> bindICompletionProposalComparator() {
		return ProposalComparator.class;
	}

	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return ApplauseDslProjectCreator.class;
	}

}
