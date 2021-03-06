package templates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.ProjectClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.google.common.collect.Lists;

public class Extensions {

	private static Set<ProjectClass> currentImportBag;
	private static Map<String, ProjectClass> classes;
	private static Stack<Map<EObject, String>> scopeStack;

	static {
		reset();
	}
	
	public static void reset() {
		currentImportBag = new HashSet<ProjectClass>();
		classes = new ConcurrentHashMap<String, ProjectClass>();
		scopeStack = new Stack<Map<EObject, String>>();
	}
	
	public static EObject getRootContainer(EObject obj) {
		EObject result = EcoreUtil2.getRootContainer(obj);
		return result;
	}

	public static ProjectClass createProjectClass(String name) {
		ProjectClass cl = classes.get(name);
		if (cl == null) {
			cl = ApplauseDslFactory.eINSTANCE.createProjectClass();
			cl.setName(name);
			classes.put(name, cl);
		}
		return cl;
	}

	public static String use(ProjectClass projectClass) {
		currentImportBag.add(projectClass);
		return projectClass.getName();
	}

	public static void useImportBag(Set<ProjectClass> usedClasses) {
		currentImportBag = usedClasses;
	}

	public static String replaceSettings(String str) {
		Matcher matcher = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
		StringBuffer sb = new StringBuffer();
		List<String> params = Lists.newArrayList();
		while (matcher.find()) {
			matcher.appendReplacement(sb, "");
			String name = matcher.group(1);
			sb.append("%@");
			params.add(name);
		}
		matcher.appendTail(sb);
		if (params.isEmpty()) {
			return "@\"" + str + "\"";
		} else {
			use(createProjectClass("Settings"));
			return "[NSString stringWithFormat:@\"" + sb.toString() + "\", " + StringUtils.join(params, ", ") + "]";
		}
	}

	public static void scopeStart() {
		Map<EObject, String> scope = new HashMap<EObject, String>();
		if (!scopeStack.isEmpty())
			scope.putAll(scopeStack.peek());
		scopeStack.push(scope);
	}

	public static void scopeEnd() {
		scopeStack.pop();
	}

	public static String scopeBind(EObject obj, String name) {
		if (scopeStack.isEmpty())
			throw new RuntimeException("No scope was started!");
		scopeStack.peek().put(obj, name);
		return name;
	}

	public static String scopeGet(EObject obj) {
		if (scopeStack.isEmpty())
			return null;
		return scopeStack.peek().get(obj);
	}

}