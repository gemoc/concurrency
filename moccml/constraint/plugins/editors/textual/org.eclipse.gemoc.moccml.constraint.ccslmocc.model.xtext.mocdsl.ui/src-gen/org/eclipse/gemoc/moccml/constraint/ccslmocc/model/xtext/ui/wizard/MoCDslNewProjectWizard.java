package org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IExtendedProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class MoCDslNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public MoCDslNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New MoCDsl Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	@Override
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("MoCDsl Project");
		mainPage.setDescription("Create a new MoCDsl project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IExtendedProjectInfo getProjectInfo() {
		org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.ui.wizard.MoCDslProjectInfo projectInfo = new org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.ui.wizard.MoCDslProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		if (!mainPage.useDefaults()) {
			projectInfo.setLocationPath(mainPage.getLocationPath());
		}
		return projectInfo;
	}

}
