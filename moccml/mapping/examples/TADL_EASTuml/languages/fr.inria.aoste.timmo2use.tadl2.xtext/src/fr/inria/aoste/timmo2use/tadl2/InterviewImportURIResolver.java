package fr.inria.aoste.timmo2use.tadl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.ImportStatement;

public class InterviewImportURIResolver extends ImportUriResolver
{

	@Override
	public String apply(EObject from) {
		String s= super.apply(from);		
		return s;
	}

	@Override
	public String resolve(EObject object) {	
		//String s= super.resolve(object);
		if (!(object instanceof ImportStatement ))
		{
			return null;
		}
		String s= ((ImportStatement) object).getImportURI();			
		if (s==null)
			return null;
	/*	if ( "ccsl:kernel".equals(s))
			return "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib";
		if ( "ccsl:lib".equals(s))
			return "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib";*/
		try
		{
		if (s.indexOf(":")!=-1)
			s= object.eResource().getResourceSet().getURIConverter().normalize(URI.createURI(s)).toString();
			//return s;
		}
		catch (Throwable e) {
			return "platform:/";
		}
		String uri =((ImportStatement) object).getAlias();
		if (lst.indexOf(object)==-1) lst.add(object);
		mycache.put(s, uri);
		return s;
	}
	
	List<EObject> lst= new ArrayList<EObject>();
	HashMap<String,String> mycache= new HashMap<String, String>(); 
	
	public String getID(String s)
	{
		if (s==null)
			return null;
		String result=null;
		/*for( EObject eo:lst)
		{
			if(s.equals(mycache.get(eo)))
			{
				if ( eo instanceof ImportStatement)
					return ((ImportStatement) eo).getAlias();
			}
		}*/
		result= mycache.get(s);
		return result;
	}
	
	
	
}