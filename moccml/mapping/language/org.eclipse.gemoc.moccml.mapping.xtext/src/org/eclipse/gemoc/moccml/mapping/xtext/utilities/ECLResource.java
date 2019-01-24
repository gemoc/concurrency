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
package org.eclipse.gemoc.moccml.mapping.xtext.utilities;

import java.util.Map;

import org.eclipse.gemoc.moccml.mapping.xtext.as2cs.EclAS2CS;
import org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot.ECL2AS;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.as2cs.AS2CS;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;

public class ECLResource extends CompleteOCLCSResource
{
	
	@Override
	public @NonNull AS2CS createAS2CS(@NonNull Map<? extends BaseCSResource, ? extends ASResource> cs2asResourceMap,
			@NonNull EnvironmentFactoryInternal environmentFactory) {
		return new EclAS2CS(cs2asResourceMap, environmentFactory);
	}

	@Override
	public @NonNull CS2AS createCS2AS(@NonNull EnvironmentFactoryInternal environmentFactory, @NonNull ASResource asResource) {
		return new ECL2AS(environmentFactory, this, asResource);
	}

	@Override
	public @NonNull String getASContentType() {
		return ASResource.COMPLETE_OCL_CONTENT_TYPE;
	}

	@Override
	public @NonNull ASResourceFactory getASResourceFactory() {
		return ECLASResourceFactory.getInstance();
	}

	@Override
	public @NonNull String getEditorName() {
		return "ECL";
	}
}
