package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.pages.CreateDSEWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class CreateDSEWizard extends Wizard {

	protected CreateDSEWizardContextAction context;
	

	public CreateDSEWizard(CreateDSEWizardContextAction context) {
		super();
		this.setWindowTitle("Create DSE");
		//context = new CreateDSAWizardContextAction(updatedGemocLanguageProject);
		this.context = context;
		addPage(new CreateDSEWizardPage("Create DSE", context));
	}

	@Override
	public void addPages() {
		
		super.addPages();
	}

	@Override
	public boolean performFinish() {
		// do the selected actions now ...
		context.execute();
		return true;
	}
}
