package org.gemoc.gemoc_language_workbench.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.gemoc.executionframework.ui.xdsml.wizards.AbstractCreateNewGemocLanguageProject;
import org.gemoc.gemoc_language_workbench.ui.builder.ToggleNatureAction;

public class CreateNewGemocLanguageProject extends AbstractCreateNewGemocLanguageProject {

	public CreateNewGemocLanguageProject() {
		super();		
	}

	protected void initializeProject(IProject project, String languageName) {
		new ToggleNatureAction().toggleNature(project, languageName);
	}
	
	
}
