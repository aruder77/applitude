// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.ApplauseDslStandaloneSetup;
import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.Cell;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.ComplexProviderConstruction;
import org.applause.applausedsl.applauseDsl.ContentProvider;
import org.applause.applausedsl.applauseDsl.Model;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Property;
import org.applause.applausedsl.applauseDsl.ScopeName;
import org.applause.applausedsl.applauseDsl.SimpleProviderConstruction;
import org.applause.applausedsl.applauseDsl.TableView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.Test;

import templates.Extensions;

import com.google.common.collect.Iterables;

public class ExtensionsTest extends AbstractXtextTests {

	private XtendFacade xtend;

	private Parameter parameterFoo;
	private Property prop1;
	private Property prop2;
	private ContentProvider contentProvider;
	private Model model;
	private TableView table;
	private ComplexProviderConstruction complexProviderConstruction;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(ApplauseDslStandaloneSetup.class);
		xtend = XtendFacade.create("templates::iphone::Extensions");
		xtend.registerMetaModel(new JavaBeansMetaModel());
		XtextResource resource = getResource(this.getClass().getResourceAsStream("ExtensionsTest.applitude"));

		model = (Model) resource.getContents().get(0);

		Extensions.scopeStart();

		parameterFoo = ApplauseDslFactory.eINSTANCE.createParameter();
		parameterFoo.setName("foo");
		Extensions.scopeBind(parameterFoo, "fFoo");

		prop1 = ApplauseDslFactory.eINSTANCE.createProperty();
		prop1.setName("prop1");

		prop2 = ApplauseDslFactory.eINSTANCE.createProperty();
		prop2.setName("prop2");

		contentProvider = ApplauseDslFactory.eINSTANCE.createContentProvider();

		table = Iterables.filter(model.eContents(), TableView.class).iterator().next();
		complexProviderConstruction = (ComplexProviderConstruction) table.getVariables().get(0).getValue();

	};

	@Override
	protected void tearDown() throws Exception {
		Extensions.scopeEnd();
	}

	@Test
	public void testResolveToProviderStraight() throws Exception {
		ObjectReference ref = ref(parameterFoo);
		assertResolveToProvider("fFoo", ref);
	}

	@Test
	public void testResolveToProviderNested() throws Exception {
		ObjectReference ref = ref(parameterFoo, prop1);
		assertResolveToProvider("[ContentProvider nestedContentProviderWithContentProvider:fFoo keyPath:@\"prop1\"]",
				ref);
	}

	@Test
	public void testResolveToProviderDeepNested() throws Exception {
		ObjectReference ref = ref(parameterFoo, prop1, prop2);
		assertResolveToProvider(
				"[ContentProvider nestedContentProviderWithContentProvider:fFoo keyPath:@\"prop1.prop2\"]", ref);
	}

	@Test
	public void testSimpleProviderConstructionResolveToProvider() throws Exception {
		ObjectReference ref = ref(parameterFoo);
		SimpleProviderConstruction construction = ApplauseDslFactory.eINSTANCE.createSimpleProviderConstruction();
		construction.setExpression(ref);
		assertResolveToProvider("fFoo", construction);
	}

	@Test
	public void testComplexProviderConstructionResolveToProvider() throws Exception {
		assertResolveToProvider("[[ExtensionsTestProviders sharedProviders] providerForAllInventors]",
				complexProviderConstruction);
	}

	@Test
	public void testComplexProviderConstructionWithArgsResolveToProvider() throws Exception {
		Parameter param1 = ApplauseDslFactory.eINSTANCE.createParameter();
		param1.setName("param1");
		complexProviderConstruction.getProvider().setParameter(param1);
		complexProviderConstruction.setArgument(ref(parameterFoo));
		assertResolveToProvider("[[ExtensionsTestProviders sharedProviders] providerForAllInventorsWithParam1:fFoo]",
				complexProviderConstruction);
	}

	@Test
	public void testProviderExpressionStraight() throws Exception {
		assertProviderExpression("fInventors", 0);
	}

	@Test
	public void testProviderExpressionNested() throws Exception {
		assertProviderExpression(
				"[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@\"knows\"]", 1);
	}

	@Test
	public void testProviderExpressionDeepNested() throws Exception {
		assertProviderExpression(
				"[ContentProvider nestedContentProviderWithContentProvider:fInventor keyPath:@\"inspiredBy.knows\"]", 2);
	}

	@Deprecated
	private void assertProviderExpression(String expectedExpression, int cellIndex) {
		Cell cell = table.getSections().get(0).getCells().get(cellIndex);
		CollectionIterator iterator = cell.getIterator();
		assertEquals(expectedExpression, xtend.call("providerExpression", iterator.getCollection()));
	}

	private void assertResolveToProvider(String expectedExpression, EObject object) {
		assertEquals(expectedExpression, xtend.call("resolveToProvider", object));
	}

	private ObjectReference ref(ScopeName... path) {
		final ObjectReference rootRef = ApplauseDslFactory.eINSTANCE.createObjectReference();
		ObjectReference lastRef = rootRef;

		for (int i = 0; i < path.length; i++) {
			ScopeName i_name = path[i];
			if (i == 0) {
				rootRef.setObject(i_name);
			} else {
				ObjectReference ref = ApplauseDslFactory.eINSTANCE.createObjectReference();
				ref.setObject(i_name);
				lastRef.setTail(ref);
				lastRef = ref;
			}
		}

		return rootRef;
	}

}
