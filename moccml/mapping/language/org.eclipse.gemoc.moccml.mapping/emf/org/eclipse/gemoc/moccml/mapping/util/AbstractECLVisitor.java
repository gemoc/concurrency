/*******************************************************************************
 * Copyright (c) 2012, 2019 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
package	org.eclipse.gemoc.moccml.mapping.util;

/**
 */
public abstract class AbstractECLVisitor<R, C>
 extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractCompleteOCLCSVisitor<R, C>
	implements ECLVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractECLVisitor(C context) {
	    super(context);
	}
}
