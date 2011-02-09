package org.applause.applausedsl.ui.generator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

import templates.Extensions;

public class Generator implements IXtextBuilderParticipant {

	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		Extensions.reset();
		AbstractBuildStrategy buildStrategy = new IPhoneBuildStrategy(context);
		buildStrategy.build(monitor);
	}
}
