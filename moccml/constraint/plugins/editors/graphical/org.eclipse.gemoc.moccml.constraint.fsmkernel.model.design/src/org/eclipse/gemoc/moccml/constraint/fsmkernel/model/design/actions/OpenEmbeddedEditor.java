/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.actions;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.ui.internal.FSMDslActivator;

import com.google.inject.Injector;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor {
	
    @Override
    protected Injector getInjector() {
        return  FSMDslActivator.getInstance().getInjector(FSMDslActivator.ORG_ECLIPSE_GEMOC_MOCCML_CONSTRAINT_FSMKERNEL_MODEL_XTEXT_FSMDSL);
    }
}

