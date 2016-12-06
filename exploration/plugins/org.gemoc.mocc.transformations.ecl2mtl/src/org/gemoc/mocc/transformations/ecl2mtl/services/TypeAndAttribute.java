package org.gemoc.mocc.transformations.ecl2mtl.services;

import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Type;

public class TypeAndAttribute 
{
	protected Type type;
	protected Property prop;
	
	public TypeAndAttribute(Type t, Property p) 
	{
		type = t;
		prop = p;
	}
}
