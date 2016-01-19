package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.builder.ToggleNatureAction;

import fr.inria.diverse.melange.ui.wizards.NewMelangeProjectWizard;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardPage;

public class CreateNewGemocConcurrentLanguageProject extends NewMelangeProjectWizard {

	public CreateNewGemocConcurrentLanguageProject() {
		super();
	}

	@Override
	public void addPages() {
		super.addPages();
		
		NewMelangeProjectWizardPage firstPage = (NewMelangeProjectWizardPage) getPage("wizardPage"); 
		firstPage.setTitle("Project");
		firstPage.setDescription("Create a new Gemoc Concurrent Language Project");
		firstPage.updateNameProject("org.company.my_concurrent_language.xdsml");
	}

	@Override
	public void configureProject(IProject project, IProgressMonitor monitor) {
		super.configureProject(project, monitor);
		new ToggleNatureAction().toggleNature(project);
	}
	
	
}
