package org.gemoc.gemoc_language_workbench.conf.presentation;

import org.gemoc.gemoc_language_workbench.conf.ConcurrentLanguageDefinition;


/**
 * This helper is to workaround a strange problem with Windows Builder
 * if a method with non simple type is declared in the XDSMLModelWrapper then the data binding tool doesn't work correctly :-/
 * @author dvojtise
 *
 */
class XDSMLModelWrapperHelper{
	public static void init(XDSMLModelWrapper wrapper, ConcurrentLanguageDefinition languageDefinition) {
		wrapper.languageDefinition=languageDefinition;
		languageDefinition.eAdapters().add(new EMFEContent(wrapper));
	}
}