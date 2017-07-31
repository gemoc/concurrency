/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *     I3S Laboratory - API update and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors;

import org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence;


public class CodeExecutionException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9178319370796707893L;

	private MSEOccurrence _mseOccurrence;
	
	private boolean codeExecutionApplicable = true;
	
	

	public CodeExecutionException(String message, MSEOccurrence mseOccurrence)
	{
		this(message, null, mseOccurrence);
	}
	
	public CodeExecutionException(String message, MSEOccurrence mseOccurrence, boolean codeExecutionApplicable)
	{
		this(message, null, mseOccurrence);
		this.codeExecutionApplicable = codeExecutionApplicable;
	}

	public CodeExecutionException(String message, Exception innerException, MSEOccurrence mseOccurrence)
	{
		super(message, innerException);
		_mseOccurrence = mseOccurrence;
	}
	
	public CodeExecutionException(String message, Exception innerException, MSEOccurrence mseOccurrence, boolean codeExecutionApplicable)
	{
		super(message, innerException);
		_mseOccurrence = mseOccurrence;
		this.codeExecutionApplicable = codeExecutionApplicable;
	}

	public MSEOccurrence getMseOccurrence()
	{		
		return _mseOccurrence;
	}
	
	public boolean isCodeExecutionApplicable() {
		return codeExecutionApplicable;
	}

	public void setCodeExecutionApplicable(boolean codeExecutionApplicable) {
		this.codeExecutionApplicable = codeExecutionApplicable;
	}
	
}
