/*
* generated by Xtext
*/
package org.gemoc.mocc.cometafsm.model.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FSMDslStandaloneSetup extends FSMDslStandaloneSetupGenerated{

	public static void doSetup() {
		new FSMDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

