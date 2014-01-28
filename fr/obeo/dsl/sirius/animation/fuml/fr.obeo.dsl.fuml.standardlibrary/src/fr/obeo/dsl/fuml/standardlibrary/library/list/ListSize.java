/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package fr.obeo.dsl.fuml.standardlibrary.library.list;

import java.util.ArrayList;
import java.util.List;

import fr.obeo.dsl.fuml.Semantics.Classes.Kernel.IntegerValue;
import fr.obeo.dsl.fuml.Semantics.Classes.Kernel.Value;
import fr.obeo.dsl.fuml.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fr.obeo.dsl.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fr.obeo.dsl.fuml.standardlibrary.Activator;

public class ListSize extends OpaqueBehaviorExecution {

	@Override
	public void doBody(List<ParameterValue> inputParameters, List<ParameterValue> outputParameters) {
		try {
			List<Value> list = inputParameters.get(0).values;
			IntegerValue result = new IntegerValue();
			result.value = list.size();
	    	result.type = this.locus.factory.getBuiltInType("Integer"); // ADDED
			List<Value> outputs = new ArrayList<Value>();
			outputs.add(result);
			outputParameters.get(0).values = outputs;
		} catch (Exception e) {
			Activator.getDefault().error("An error occured during the execution of ListSize " + e.getMessage(), e);
		}
	}

	@Override
	public Value new_() {
		return new ListSize();
	}
}
