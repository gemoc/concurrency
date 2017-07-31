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
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.services;


import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.Transition;


/**
 * ODesign services
 * @author Creffst
 *
 */
public class MoCMLServices {
	
	public MoCMLServices() {
		// TODO Auto-generated constructor stub
	}
	
	public String computeLabel(Transition element){
		StringBuilder sb = new StringBuilder(16);
		sb.append("[");
		
		element.getName();
		element.getTrigger();
		return sb.toString();
	}
	
}
