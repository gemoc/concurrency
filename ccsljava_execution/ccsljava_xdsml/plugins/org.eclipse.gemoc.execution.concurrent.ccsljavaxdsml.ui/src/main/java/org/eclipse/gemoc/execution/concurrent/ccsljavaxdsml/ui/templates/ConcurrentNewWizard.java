package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.templates;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.ITemplateSection;

import fr.inria.diverse.melange.ui.templates.melange.SimpleMTNewWizard;

public class ConcurrentNewWizard extends SimpleMTNewWizard{

	@Override
	public void init(BaseProjectWizardFields data) {
		super.init(data);
		setWindowTitle("Simple concurrent GEMOC project");
	}
	
	@Override
	public ITemplateSection[] createTemplateSections() {
		return new ITemplateSection[] {new ConcurrentTemplate()};
	}
}
