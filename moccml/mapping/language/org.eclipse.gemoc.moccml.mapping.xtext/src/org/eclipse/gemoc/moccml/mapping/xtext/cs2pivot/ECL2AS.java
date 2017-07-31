/**
 * <copyright>
 *
 * Copyright (c) 2012, 2017 UNS/I3S/INRIA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Julien DeAntoni
 *
 * </copyright>
 *
 * $Id: ECL2MonikerVisitor.java, 2012/01/15 19:28:59 julien deantoni $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS;


public class ECL2AS extends CompleteOCLCS2AS
{
	
		
	public ECL2AS(@NonNull EnvironmentFactoryInternal environmentFactory, @NonNull BaseCSResource csResource, @NonNull ASResource asResource) {
		super(environmentFactory, csResource, asResource);
	}
	
	@Override
	protected ECLContainmentVisitor createContainmentVisitor(CS2ASConversion converter) {
		return new ECLContainmentVisitor(converter);
	}
		
	@Override
	public ECLLeft2RightVisitor createLeft2RightVisitor(CS2ASConversion converter) {
		return new ECLLeft2RightVisitor(converter);
	}
	@Override
	public ECLPostOrderVisitor createPostOrderVisitor(CS2ASConversion converter) {
		return new ECLPostOrderVisitor(converter);
	}
	@Override
	public ECLPreOrderVisitor createPreOrderVisitor(CS2ASConversion converter) {
		return new ECLPreOrderVisitor(converter);
	}

}
