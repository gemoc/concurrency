
package fr.inria.aoste.timmo2use.tadl2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Tadl2StandaloneSetup extends Tadl2StandaloneSetupGenerated{

	public static void doSetup() {
		new Tadl2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

