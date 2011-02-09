// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.CollectionLiteral;
import org.applause.applausedsl.applauseDsl.StringConcat;
import org.applause.applausedsl.applauseDsl.StringReplace;
import org.applause.applausedsl.applauseDsl.StringSplit;
import org.applause.applausedsl.applauseDsl.StringUrlConform;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

public class ResolveToValueTest extends AbstractExtensionsTest {

	@Test
	public void testStringLiteral() throws Exception {
		assertResolveToValue("@\"foo\"", str("foo"));
	}

	@Test
	public void testStringConcat() throws Exception {
		assertResolveToValue("[NSString stringWithFormat:@\"%@%@\", @\"foo\", @\"bar\"]",
				concat(str("foo"), str("bar")));
	}

	@Test
	public void testStringConcatNested() throws Exception {
		StringConcat concat = concat(str("foo"), str("bar"));
		assertResolveToValue(
				"[NSString stringWithFormat:@\"%@%@\", [NSString stringWithFormat:@\"%@%@\", @\"foo\", @\"bar\"], @\"mo\"]",
				concat(concat, str("mo")));
	}

	@Test
	public void testStringUrlConform() throws Exception {
		StringUrlConform expr = ApplauseDslFactory.eINSTANCE.createStringUrlConform();
		expr.setValue(str("foo"));
		assertResolveToValue("[@\"foo\" stringByAddingPercentEscapesUsingEncoding:NSUTF8StringEncoding]", expr);
	}

	@Test
	public void testStringReplace() throws Exception {
		StringReplace expr = ApplauseDslFactory.eINSTANCE.createStringReplace();
		expr.setValue(str("foo"));
		expr.setMatch(str("x"));
		expr.setReplacement(str("y"));
		assertResolveToValue("[@\"foo\" stringByReplacingOccurrencesOfString:@\"x\" withString:@\"y\"]", expr);
	}

	@Test
	public void testStringSplit() throws Exception {
		StringSplit expr = ApplauseDslFactory.eINSTANCE.createStringSplit();
		expr.setValue(str("foo"));
		expr.setDelimiter(str("x"));
		assertResolveToValue("[@\"foo\" componentsSeparatedByString:@\"x\"]", expr);
	}

	@Test
	public void testNull() throws Exception {
		assertResolveToValue("nil", null);
	}

	@Test
	public void testCollectionLiteral() throws Exception {
		CollectionLiteral literal = ApplauseDslFactory.eINSTANCE.createCollectionLiteral();
		literal.getItems().add(str("1"));
		literal.getItems().add(str("2"));
		assertResolveToValue("[NSArray arrayWithObjects:@\"1\", @\"2\", nil]", literal);
	}

	@Test
	public void testObjectReference() throws Exception {
		assertResolveToValue("fFoo.content", ref(parameterFoo));
		assertResolveToValue("[fFoo.content valueForKey:@\"prop1\"]", ref(parameterFoo, prop1));
		assertResolveToValue("[fFoo.content valueForKeyPath:@\"prop1.prop2\"]", ref(parameterFoo, prop1, prop2));
	}

	private void assertResolveToValue(String expected, EObject object) {
		assertEquals(expected, xtend.call("resolveToValue", object));
	}

}
