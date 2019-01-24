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
public interface DecorableECLVisitor<R> extends ECLVisitor<R>, org.eclipse.ocl.xtext.completeoclcs.util.DecorableCompleteOCLCSVisitor<R>
{
//	DecorableECLVisitor<R, C> createNestedVisitor();
	void setUndecoratedVisitor(org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor<R> visitor);
}
