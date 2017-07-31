/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
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
