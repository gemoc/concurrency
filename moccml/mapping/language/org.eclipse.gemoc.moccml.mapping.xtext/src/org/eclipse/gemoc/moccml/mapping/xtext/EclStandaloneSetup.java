/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/

package org.eclipse.gemoc.moccml.mapping.xtext;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.xtext.scoping.ECLScoping;
import org.eclipse.gemoc.moccml.mapping.xtext.utilities.ECLASResourceFactory;
import org.eclipse.ocl.pivot.labels.ILabelGenerator;
import org.eclipse.ocl.xtext.completeocl.utilities.PathNameDeclCSLabelGenerator;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EclStandaloneSetup extends EclStandaloneSetupGenerated{
	private static Injector injector = null;
	
	public static void doSetup() {
		if (injector == null) {
			/*injector = */new EclStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
	}
	
	public static void doTearDown() {
		injector = null;
	}

	public static void init() {
		//CompleteOCLStandaloneSetup.doSetup();
		ECLScoping.init();
		ECLASResourceFactory.getInstance().getClass();
//		ECL2MonikerVisitor.FACTORY.getClass();
//		ECL2Pivot.FACTORY.getClass();
	//	CompleteOCLCS2Pivot.FACTORY.getClass();
		EPackage.Registry.INSTANCE.put(MoCCMLmappingPackage.eNS_URI, MoCCMLmappingPackage.eINSTANCE);
		PathNameDeclCSLabelGenerator.initialize(ILabelGenerator.Registry.INSTANCE);

	}
	
	/**
	 * Return the Injector for this plugin.
	 */
	public static final Injector getInjector() {
//		if (injector == null) {
//			doSetup();
//		}
		return injector;
	}

	@Override
	public Injector createInjector() {
		init();
		return super.createInjector();
	}
}

