package org.applause.applausedsl.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopedElementsFor;

import org.applause.applausedsl.applauseDsl.ScopeName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;

public class ScopeNameScope extends AbstractScope {

	protected final EObject context;
	
	public ScopeNameScope(EObject context) {
		Preconditions.checkNotNull(context);
		this.context = context;
	}

	public IScope getOuterScope() {
		if(context.eContainer() == null)
			return IScope.NULLSCOPE;
		else
			return new ScopeNameScope(context.eContainer());
	}

	@Override
	protected Iterable<IEObjectDescription> internalGetContents() {
		Iterable<ScopeName> declarations = Iterables.filter(context.eContents(), ScopeName.class);
		return scopedElementsFor(declarations);
	}

}
