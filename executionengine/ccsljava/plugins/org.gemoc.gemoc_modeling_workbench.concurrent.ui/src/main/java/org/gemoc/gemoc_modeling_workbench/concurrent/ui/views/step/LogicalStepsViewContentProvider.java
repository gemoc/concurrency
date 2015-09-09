package org.gemoc.gemoc_modeling_workbench.concurrent.ui.views.step;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.gemoc.execution.engine.trace.gemoc_execution_trace.LogicalStep;
import org.gemoc.executionengine.ccsljava.api.core.INonDeterministicExecutionEngine;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;

public class LogicalStepsViewContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() 
	{
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) 
	{
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof INonDeterministicExecutionEngine)
		{
			INonDeterministicExecutionEngine engine = (INonDeterministicExecutionEngine)inputElement;
			if (engine.getRunningStatus().equals(RunStatus.Stopped))
			{
				String message = "Engine is not running";
				return new Object[] {
					message
				};				
			}
			else
			{
				if (engine.getPossibleLogicalSteps() != null)
				{
					return engine.getPossibleLogicalSteps().toArray();				
				}
				else
				{
					return new Object[] {};
				}
			}
		}
		else if (inputElement instanceof LogicalStep)
		{
			LogicalStep ls = (LogicalStep)inputElement;
			return ls.getMseOccurrences().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof INonDeterministicExecutionEngine)
		{
			INonDeterministicExecutionEngine engine = (INonDeterministicExecutionEngine)parentElement;
			return engine.getPossibleLogicalSteps().toArray();
		}
		else if (parentElement instanceof LogicalStep)
		{
			LogicalStep ls = (LogicalStep)parentElement;
			return ls.getMseOccurrences().toArray();
		}
		return new Object[0];	
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) 
	{
		if (element instanceof INonDeterministicExecutionEngine)
		{
			INonDeterministicExecutionEngine engine = (INonDeterministicExecutionEngine)element;
			return engine.getPossibleLogicalSteps().size() > 0;
		}
		else if (element instanceof LogicalStep)
		{
			LogicalStep ls = (LogicalStep)element;
			return ls.getMseOccurrences().size() > 0;
		}
		return false;	
	}



}