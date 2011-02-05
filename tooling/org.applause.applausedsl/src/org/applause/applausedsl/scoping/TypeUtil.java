package org.applause.applausedsl.scoping;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.CollectionLiteral;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.ScopeName;
import org.applause.applausedsl.applauseDsl.Type;
import org.applause.applausedsl.applauseDsl.TypeReference;
import org.applause.applausedsl.applauseDsl.TypedName;
import org.applause.applausedsl.applauseDsl.util.ApplauseDslSwitch;
import org.eclipse.emf.ecore.EObject;

public class TypeUtil {
	
	public static ApplauseDslSwitch<TypeReference> typeOf = new ApplauseDslSwitch<TypeReference>() {
		
		@Override
		public TypeReference caseTypedName(TypedName object) {
			return object.getTypeRef();
		}
		
		@Override
		public TypeReference caseCollectionIterator(CollectionIterator object) {
			return doGetTypeOf(object.getCollection());
		}

		@Override
		public TypeReference caseObjectReference(ObjectReference object) {
			while (object.getTail() != null)
				object = object.getTail();

			return doGetTypeOf(object.getObject());
		}
		
		@Override
		public TypeReference caseCollectionLiteral(CollectionLiteral object) {
			TypeReference result = ApplauseDslFactory.eINSTANCE.createTypeReference();
			result.setMany(true);
			Type type = doGetTypeOf(object.getItems().get(0)).getType();
			result.setType(type);
			return result;
		}
		
	};
	
	private static TypeReference doGetTypeOf(EObject object) {
		return typeOf.doSwitch(object);
	}
	
	public static TypeReference getTypeOf(ScopeName declaration) {
		return doGetTypeOf(declaration);
	}
	
}