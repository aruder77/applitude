package org.applause.applausedsl.scoping;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.Assignment;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.CollectionLiteral;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Property;
import org.applause.applausedsl.applauseDsl.Type;
import org.applause.applausedsl.applauseDsl.TypeReference;
import org.applause.applausedsl.applauseDsl.util.ApplauseDslSwitch;
import org.eclipse.emf.ecore.EObject;

public class TypeUtil {

	private final static ApplauseDslSwitch<TypeReference> typeOf = new ApplauseDslSwitch<TypeReference>() {

		@Override
		public TypeReference caseParameter(Parameter object) {
			return object.getTypeRef();
		}

		@Override
		public TypeReference caseProperty(Property object) {
			return object.getTypeRef();
		}

		@Override
		public TypeReference caseAssignment(Assignment object) {
			return object.getTypeRef();
		}

		@Override
		public TypeReference caseCollectionIterator(CollectionIterator object) {
			return doSwitch(object.getCollection());
		}

		@Override
		public TypeReference caseObjectReference(ObjectReference object) {
			while(object.getTail() != null)
				object = object.getTail();
			return doSwitch(object.getObject());
		}

		@Override
		public TypeReference caseCollectionLiteral(CollectionLiteral object) {
			TypeReference result = ApplauseDslFactory.eINSTANCE.createTypeReference();
			result.setMany(true);
			Type type = doSwitch(object.getItems().get(0)).getType();
			result.setType(type);
			return result;
		}

		public TypeReference doSwitch(EObject object) {
			if (object == null)
				return null;
			return super.doSwitch(object);
		}

	};

	public static TypeReference getTypeOf(EObject object) {
		return typeOf.doSwitch(object);
	}

}
