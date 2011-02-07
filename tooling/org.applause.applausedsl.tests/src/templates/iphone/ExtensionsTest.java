// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.ApplauseDslStandaloneSetup;
import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.Cell;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.ComplexProviderConstruction;
import org.applause.applausedsl.applauseDsl.Model;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Property;
import org.applause.applausedsl.applauseDsl.ScalarExpression;
import org.applause.applausedsl.applauseDsl.ScopeName;
import org.applause.applausedsl.applauseDsl.SimpleProviderConstruction;
import org.applause.applausedsl.applauseDsl.StringConcat;
import org.applause.applausedsl.applauseDsl.StringLiteral;
import org.applause.applausedsl.applauseDsl.StringReplace;
import org.applause.applausedsl.applauseDsl.StringUrlConform;
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
	public void testStringLiteralResolveToValue() throws Exception {
		assertResolveToValue("@\"foo\"", str("foo"));
	}

	private StringLiteral str(String value) {
		StringLiteral literal = ApplauseDslFactory.eINSTANCE.createStringLiteral();
		literal.setValue(value);
		return literal;
	}

	@Test
	public void testStringConcatResolveToValue() throws Exception {
		assertResolveToValue("[NSString stringWithFormat:@\"%@%@\", @\"foo\", @\"bar\"]", concat(str("foo"), str("bar")));
	}

	@Test
	public void testStringConcatResolveToValueNested() throws Exception {
		StringConcat concat = concat(str("foo"), str("bar"));
		assertResolveToValue("[NSString stringWithFormat:@\"%@%@\", [NSString stringWithFormat:@\"%@%@\", @\"foo\", @\"bar\"], @\"mo\"]", concat(concat, str("mo")));
	}

	@Test
	public void testStringUrlConformResolveToValue() throws Exception {
		StringUrlConform expr = ApplauseDslFactory.eINSTANCE.createStringUrlConform();
		expr.setValue(str("foo"));
		assertResolveToValue("[@\"foo\" stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]", expr);
	}

	@Test
	public void testStringReplaceResolveToValue() throws Exception {
		StringReplace expr = ApplauseDslFactory.eINSTANCE.createStringReplace();
		expr.setValue(str("foo"));
		expr.setMatch(str("x"));
		expr.setReplacement(str("y"));
		assertResolveToValue("[@\"foo\" stringByReplacingOccurrencesOfString:@\"x\" withString:@\"y\"]", expr);
	}

	@Test
	public void testNullResolveToValue() throws Exception {
		assertResolveToValue("nil", null);
	}

	@Test
	public void testObjectReferenceResolveToValue() throws Exception {
		assertResolveToValue("fFoo.content",
				ref(parameterFoo));
		assertResolveToValue("[fFoo.content valueForKey:@\"prop1\"]",
				ref(parameterFoo, prop1));
		assertResolveToValue("[fFoo.content valueForKeyPath:@\"prop1.prop2\"]",
				ref(parameterFoo, prop1, prop2));

	}

	private StringConcat concat(ScalarExpression... values) {
		StringConcat concat = ApplauseDslFactory.eINSTANCE.createStringConcat();
		for (ScalarExpression value : values) {
			concat.getValues().add(value);
		}
		return concat;
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

	private void assertResolveToProvider(String expected, EObject object) {
		assertEquals(expected, xtend.call("resolveToProvider", object));
	}

	private void assertResolveToValue(String expected, EObject object) {
		assertEquals(expected, xtend.call("resolveToValue", object));
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
