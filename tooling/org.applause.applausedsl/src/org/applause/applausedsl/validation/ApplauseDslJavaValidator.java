package org.applause.applausedsl.validation;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.Application;
import org.applause.applausedsl.applauseDsl.ConstructProviderCall;
import org.applause.applausedsl.applauseDsl.ContentProvider;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.ParameterDefinitions;
import org.applause.applausedsl.applauseDsl.ParameterValues;
import org.applause.applausedsl.applauseDsl.StringLiteral;
import org.applause.applausedsl.applauseDsl.Tab;
import org.applause.applausedsl.applauseDsl.View;
import org.applause.applausedsl.applauseDsl.ViewCall;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
 

public class ApplauseDslJavaValidator extends AbstractApplauseDslJavaValidator {

	public static final String VIEW_NAME_UPPERCASE = "viewname_uppercase";

//	@Check
//	void appHasOneHomeView(Model model) {
//		if (!with(model.getElements())
//			.filter(isHomeView())
//			.exactlyOnce()) {
//			error("You need to specify exactly one home view.", AppModelDslPackage.APPLICATION);
//		}
//	}

	@Check
	void parameterValueCountMatchesParameterDefinition(ParameterValues values) {
		ParameterDefinitions definitions = getParameterDefinitions(values);
		int defSize = definitions.getDefinitions().size();
		int valueSize = values.getValues().size();
		if (valueSize != defSize) {
			String parameterNames = Iterables.transform(definitions.getDefinitions(), new Function<Parameter, String>() {
				@Override
				public String apply(Parameter param) {
					return param.getName();
				}
			}).toString();
			error("Expected " + defSize + " parameters " + parameterNames + ", got " + valueSize + ".",
					ApplauseDslPackage.PARAMETER_VALUES);
		}
	}

	private ParameterDefinitions getParameterDefinitions(ParameterValues parameterValues) {
		EObject container = parameterValues.eContainer();
		if (container instanceof ViewCall)
			return ((ViewCall) container).getView().getParameters();
		if (container instanceof ConstructProviderCall)
			return ((ConstructProviderCall) container).getProvider().getParameters();
		throw new RuntimeException("Unknown ParameterValues container: "+container);
	}

	@Check
	void cachingOnlyForUnparameterizedContent(ContentProvider contentProvider) {
		if (contentProvider.isStoring() && !contentProvider.getParameters().getDefinitions().isEmpty()) {
			error("Storing the content provider is only supported for content providers without parameters.", ApplauseDslPackage.CONTENT_PROVIDER__STORING);
		}
	}
	
	@Check
	void viewNamesShouldStartWithCapital(View view) {
		if (!Character.isUpperCase(view.getName().charAt(0))) {
			error("View names should start with an uppercase letter.", ApplauseDslPackage.VIEW__NAME, VIEW_NAME_UPPERCASE);
		}
	}
	
	@Check
	void imageExists(Application application) {
		if (application.getBackground() instanceof StringLiteral) {
			String filename = ((StringLiteral) application.getBackground()).getValue();
			Resource res = application.eResource();

			if (!imageExists(filename, res)) {
				error("The background image file you specified does not exist.", ApplauseDslPackage.APPLICATION__BACKGROUND);
			}
		}
	}
	
	@Check
	void iconExists(Tab tab) {
		if (tab.getIcon() instanceof StringLiteral) {
			String filename = ((StringLiteral) tab.getIcon()).getValue();
			Resource res = tab.eResource();
			
			if (!imageExists(filename, res)) {
				error("The icon image file you specified does not exist.", ApplauseDslPackage.TAB__ICON);
			}
		}
	}

	private boolean imageExists(String filename, Resource res) {
		URI uri = res.getURI().appendSegment("..").appendSegment("Images").appendSegment(filename);
		return (res.getResourceSet().getURIConverter().exists(uri, null));
	}

	
}
