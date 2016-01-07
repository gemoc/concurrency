package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.builder.ToggleNatureAction;
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.AbstractCreateNewGemocLanguageProject;

public class CreateNewGemocConcurrentLanguageProject extends AbstractCreateNewGemocLanguageProject {

	public CreateNewGemocConcurrentLanguageProject() {
		super();
		_askProjectNamePage.setDescription("Create a new Gemoc Concurrent Language Project");
		_askProjectNamePage.setInitialProjectName("org.company.my_concurrent_language.xdsml");
	}

	protected void initializeProject(IProject project, String languageName) {
		new ToggleNatureAction().toggleNature(project, languageName);
	}
	
	
}