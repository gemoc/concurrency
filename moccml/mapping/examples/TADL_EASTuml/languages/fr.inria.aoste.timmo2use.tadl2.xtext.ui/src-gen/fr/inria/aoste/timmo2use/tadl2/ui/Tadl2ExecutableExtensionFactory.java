/*
 * generated by Xtext
 */
package fr.inria.aoste.timmo2use.tadl2.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.inria.aoste.timmo2use.tadl2.ui.internal.Tadl2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Tadl2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Tadl2Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Tadl2Activator.getInstance().getInjector(Tadl2Activator.FR_INRIA_AOSTE_TIMMO2USE_TADL2_TADL2);
	}
	
}
