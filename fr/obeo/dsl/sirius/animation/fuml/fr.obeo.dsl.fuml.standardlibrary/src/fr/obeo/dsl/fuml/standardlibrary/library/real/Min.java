package fr.obeo.dsl.fuml.standardlibrary.library.real;

import java.util.ArrayList;
import java.util.List;

import fr.obeo.dsl.fuml.Semantics.Classes.Kernel.RealValue;
import fr.obeo.dsl.fuml.Semantics.Classes.Kernel.Value;
import fr.obeo.dsl.fuml.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fr.obeo.dsl.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import fr.obeo.dsl.fuml.standardlibrary.Activator;

public class Min extends OpaqueBehaviorExecution {

	@Override
	public void doBody(List<ParameterValue> inputParameters, List<ParameterValue> outputParameters) {
		try {
			Double x = ((RealValue)inputParameters.get(0).values.get(0)).value;
			Double y = ((RealValue)inputParameters.get(1).values.get(0)).value;
			RealValue result = new RealValue();
			result.value = Math.min(x, y);
			List<Value> outputs = new ArrayList<Value>();
	    	result.type = this.locus.factory.getBuiltInType("Real");
			outputs.add(result);
			outputParameters.get(0).values = outputs;
		} catch (Exception e) {
			Activator.getDefault().error("An error occured during the execution of Min " + e.getMessage(), e);
		}
	}

	@Override
	public Value new_() {
		return new Min();
	}
}