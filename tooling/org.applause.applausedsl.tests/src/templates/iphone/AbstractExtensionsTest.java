// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

package templates.iphone;

import org.applause.applausedsl.ApplauseDslStandaloneSetup;
import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.ContentProviderCall;
import org.applause.applausedsl.applauseDsl.Model;
import org.applause.applausedsl.applauseDsl.Named;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Property;
import org.applause.applausedsl.applauseDsl.ScalarExpression;
import org.applause.applausedsl.applauseDsl.StringConcat;
import org.applause.applausedsl.applauseDsl.StringLiteral;
import org.applause.applausedsl.applauseDsl.TableView;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;

import templates.Extensions;

import com.google.common.collect.Iterables;

public abstract class AbstractExtensionsTest extends AbstractXtextTests {

	protected XtendFacade xtend;

	protected Parameter parameterFoo;
	protected Property prop1;
	protected Property prop2;
	protected Model model;
	protected TableView table;
	protected ContentProviderCall contentProviderCall;

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
		contentProviderCall = (ContentProviderCall) table.getVariables().get(0).getValue();
	}
	
	@Override
	protected void tearDown() throws Exception {
		Extensions.scopeEnd();
	}

	protected StringConcat concat(ScalarExpression... values) {
		StringConcat concat = ApplauseDslFactory.eINSTANCE.createStringConcat();
		for (ScalarExpression value : values) {
			concat.getValues().add(value);
		}
		return concat;
	}

	protected StringLiteral str(String value) {
		StringLiteral literal = ApplauseDslFactory.eINSTANCE.createStringLiteral();
		literal.setValue(value);
		return literal;
	}

	protected ObjectReference ref(Named... path) {
		final ObjectReference rootRef = ApplauseDslFactory.eINSTANCE.createObjectReference();
		ObjectReference lastRef = rootRef;

		for (int i = 0; i < path.length; i++) {
			Named i_name = path[i];
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
