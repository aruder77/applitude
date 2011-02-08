package org.applause.applausedsl.scoping;

import java.util.Collections;

import org.applause.applausedsl.applauseDsl.ContentProvider;
import org.applause.applausedsl.applauseDsl.Declaration;
import org.applause.applausedsl.applauseDsl.TableView;
import org.applause.applausedsl.applauseDsl.View;
import org.applause.applausedsl.applauseDsl.ViewContentElement;
import org.applause.applausedsl.applauseDsl.util.ApplauseDslSwitch;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class DeclarationsSwitch {

	private static ApplauseDslSwitch<Iterable<? extends Declaration>> instance = new ApplauseDslSwitch<Iterable<? extends Declaration>>() {

		@Override
		public Iterable<? extends Declaration> caseView(View object) {
			return object.getParameters().getDefinitions();
		}

		@Override
		public Iterable<? extends Declaration> caseTableView(TableView object) {
			return Iterables.concat(object.getParameters().getDefinitions(), object.getVariables());
		}

		@Override
		public Iterable<? extends Declaration> caseContentProvider(ContentProvider object) {
			return object.getParameters().getDefinitions();
		}

		@Override
		public Iterable<? extends Declaration> caseViewContentElement(ViewContentElement object) {
			if (object.getIterator() == null)
				return Collections.emptyList();
			else
				return Lists.newArrayList(object.getIterator());
		}

	};

	public static Iterable<? extends Declaration> getDeclarations(EObject object) {
		return instance.doSwitch(object);
	}

}
