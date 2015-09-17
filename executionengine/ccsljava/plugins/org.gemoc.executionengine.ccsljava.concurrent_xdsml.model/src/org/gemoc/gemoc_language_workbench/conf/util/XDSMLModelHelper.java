package org.gemoc.gemoc_language_workbench.conf.util;

import org.gemoc.executionframework.xdsml_base.util.XDSMLBaseModelHelper;
import org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition;
import org.gemoc.gemoc_language_workbench.conf.DSAProject;
import org.gemoc.gemoc_language_workbench.conf.DSEProject;
import org.gemoc.gemoc_language_workbench.conf.MoCCProject;
import org.gemoc.gemoc_language_workbench.conf.confFactory;

public class XDSMLModelHelper extends XDSMLBaseModelHelper{
	
	public static DSAProject getOrCreateDSAProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getDsaProject() == null) {
			languageDefinition.setDsaProject(confFactory.eINSTANCE
					.createDSAProject());
		}
		return languageDefinition.getDsaProject();
	}

	public static DSEProject getOrCreateDSEProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getDSEProject() == null) {
			languageDefinition.setDSEProject(confFactory.eINSTANCE
					.createDSEProject());
		}
		return languageDefinition.getDSEProject();
	}

	public static MoCCProject getOrCreateMoCCProject(
			ConcurrentLanguageDefinition languageDefinition) {
		if (languageDefinition.getMoCCProject() == null) {
			languageDefinition.setMoCCProject(confFactory.eINSTANCE
					.createMoCCProject());
		}
		return languageDefinition.getMoCCProject();
	}
}
