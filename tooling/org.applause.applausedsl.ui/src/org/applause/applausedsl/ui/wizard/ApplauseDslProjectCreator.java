package org.applause.applausedsl.ui.wizard;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.lang.StringUtils;
import org.applause.applausedsl.ui.utils.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ApplauseDslProjectCreator extends AbstractProjectCreator {

	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "Generated";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT);

	@Inject
	private Provider<ProjectFactory> projectFactoryProvider;

	@Override
	protected ApplauseDslProjectInfo getProjectInfo() {
		return (ApplauseDslProjectInfo) super.getProjectInfo();
	}
	
	@Override
	protected String getModelFolderName() {
		return ".";
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

	@Override
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		// template.zip is created from tooling/org.applitude.template1
		InputStream stream = null;
		try {
			stream = getClass().getResourceAsStream("template.zip");
			ZipInputStream zipStream = new ZipInputStream(stream);
			ZipEntry entry;
			while ((entry = zipStream.getNextEntry()) != null) {
				String name = entry.getName();
				name = replaceTemplate(name);
				if (entry.isDirectory()) {
					IFolder folder = project.getFolder(name);
					if (!folder.exists()) {
						folder.create(true, true, monitor);
					}
				} else {
					String content = replaceTemplate(IOUtils.toString(zipStream, "UTF-8"));
					IFile file = project.getFile(name);
					file.create(new StringInputStream(content), true, monitor);
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(stream);
		}
	}

	@Override
	protected IFile getModelFile(IProject project) throws CoreException {
		return project.getFile(getProjectInfo().getProjectName() + "." + getPrimaryModelFileExtension());
	}
	
	private String replaceTemplate(String str) {
		String projectName = getProjectInfo().getProjectName();
		String capitalizedProjectName = projectName.equals("_template_") ? "_Template_" : StringUtils.capitalize(projectName);
		str = str.replace("_template_", projectName);
		str = str.replace("_Template_", capitalizedProjectName);
		return str;
	}

	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();
	}
	
	@Override
	protected String[] getProjectNatures() {
		return new String[] { XtextProjectHelper.NATURE_ID };
	}

	@Override
	protected String[] getBuilders() {
		return new String[] { XtextProjectHelper.BUILDER_ID };
	}

}