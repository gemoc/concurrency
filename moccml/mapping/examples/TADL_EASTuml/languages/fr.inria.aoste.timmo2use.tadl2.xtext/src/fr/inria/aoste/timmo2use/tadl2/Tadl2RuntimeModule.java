/*
 * generated by Xtext
 */
package fr.inria.aoste.timmo2use.tadl2;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class Tadl2RuntimeModule extends fr.inria.aoste.timmo2use.tadl2.AbstractTadl2RuntimeModule {

	
	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TADLImportUriGlobalScopeProvider.class;
	}
	
	@Override
	public void configure(Binder binder) {

		super.configure(binder);
		binder.bind(ImportUriResolver.class).to(
				InterviewImportURIResolver.class);
	
	}
//
//	@Override
//	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
//
//		return SimpleNamedElementProvider.class;
//	}

}
