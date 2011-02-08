package org.applause.applausedsl.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.applause.applausedsl.applauseDsl.Declaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

public class DeclarationScope extends AbstractScope {

	protected final EObject context;

	public DeclarationScope(EObject context) {
		Preconditions.checkNotNull(context);
		this.context = context;
	}

	public IScope getOuterScope() {
		if (context.eContainer() == null)
			return IScope.NULLSCOPE;
		else
			return new DeclarationScope(context.eContainer());
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		Iterable<? extends Declaration> declarations = DeclarationsSwitch.getDeclarations(context);
		if (declarations == null)
			return Iterables.emptyIterable();
		else
			return scopedElementsFor(declarations);
	}

}
