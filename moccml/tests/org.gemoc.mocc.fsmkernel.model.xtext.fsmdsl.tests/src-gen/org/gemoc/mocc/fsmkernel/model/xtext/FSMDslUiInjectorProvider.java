/*
* generated by Xtext
*/
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FSMDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.ui.internal.FSMDslActivator.getInstance().getInjector("org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.FSMDsl");
	}
	
}
