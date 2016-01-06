package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.CreateMoCWizardContextAction;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.pages.CreateMoCWizardPage;

public class CreateMoCWizard extends Wizard {

	protected CreateMoCWizardContextAction context;
	

	public CreateMoCWizard(CreateMoCWizardContextAction context) {
		super();
		this.setWindowTitle("Create MoCC");
		//context = new CreateMoCWizardContextAction(updatedGemocLanguageProject);
		this.context = context;
		addPage(new CreateMoCWizardPage("Create MoCC", context));
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