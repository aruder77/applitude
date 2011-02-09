// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.CollectionLiteral;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

public class ResolveToProviderTest extends AbstractExtensionsTest {

	@Test
	public void testObjectReference() throws Exception {
		ObjectReference ref = ref(parameterFoo);
		assertResolveToProvider("fFoo", ref);
	}

	@Test
	public void testObjectReferenceWithProperty() throws Exception {
		ObjectReference ref = ref(parameterFoo, prop1);
		assertResolveToProvider("[ContentProvider nestedContentProviderWithContentProvider:fFoo keyPath:@\"prop1\"]",
				ref);
	}

	@Test
	public void testObjectReferenceWithPropertyPath() throws Exception {
		ObjectReference ref = ref(parameterFoo, prop1, prop2);
		assertResolveToProvider(
				"[ContentProvider nestedContentProviderWithContentProvider:fFoo keyPath:@\"prop1.prop2\"]", ref);
	}

	@Test
	public void testContentProviderCall() throws Exception {
		assertResolveToProvider("[[ExtensionsTestProviders sharedProviders] providerForAllInventors]",
				contentProviderCall);
	}

	@Test
	public void testContentProviderCallWithParameters() throws Exception {
		Parameter param1 = ApplauseDslFactory.eINSTANCE.createParameter();
		param1.setName("param1");
		contentProviderCall.getTarget().getParameters().getDefinitions().add(param1);
		contentProviderCall.getParameters().getValues().add(ref(parameterFoo));
		assertResolveToProvider("[[ExtensionsTestProviders sharedProviders] providerForAllInventorsWithParam1:fFoo]",
				contentProviderCall);
	}

	@Test
	public void testCollectionLiteral() throws Exception {
		CollectionLiteral literal = ApplauseDslFactory.eINSTANCE.createCollectionLiteral();
		literal.getItems().add(str("1"));
		literal.getItems().add(str("2"));
		assertResolveToProvider(
				"[SimpleContentProvider providerWithContent:[NSArray arrayWithObjects:@\"1\", @\"2\", nil] name:@\"\"]",
				literal);
	}

	private void assertResolveToProvider(String expected, EObject object) {
		assertEquals(expected, xtend.call("resolveToProvider", object));
	}

}
