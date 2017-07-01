package fr.inria.aoste.timmo2use.tadl2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.impl.AbstractResourceDescription;
import org.eclipse.xtext.resource.impl.EObjectDescriptionLookUp;

import com.google.common.collect.Lists;

import fr.inria.aoste.timesquare.utils.umlhelpers.UmlHelpers;

/**
 * @author Andreas Graf - Initial contribution and API
 */
public class EventResourceDescription extends AbstractResourceDescription {

	/**
	 * @author Andreas Graf - Initial contribution and API modified by Julien
	 *         DeAntoni
	 * 
	 * 
	 */
	
	/*private static final class Switch extends EcoreSwitch<IEObjectDescription> {
		@Override
		public IEObjectDescription caseENamedElement(ENamedElement object) {
			return new EObjectDescription(
					QualifiedName.create(object.getName()), object, null);
		}
	}*/

	private Resource resource;
	private String prefix=null;
	private URI uri;

	public EventResourceDescription(Resource resource) {
		this.resource = resource;
		this.uri = getNormalizedURI(resource);
	}

	public EventResourceDescription(Resource resource, String pref) {
		this.resource = resource;
		this.uri = getNormalizedURI(resource);
		
		prefix=pref;
		
	}
	
	
	public URI getNormalizedURI(Resource r)
	{
		return super.getNormalizedURI(r);
	}
	
	
	public String getPrefix() {
		return prefix;
	}

	@Override
	protected EObjectDescriptionLookUp getLookUp() {
		return super.getLookUp();
		//return new EObjectDescriptionLookUp(computeExportedObjects());
	}

	
	List<IEObjectDescription> result=null;
	@Override
	protected List<IEObjectDescription> computeExportedObjects() {
		if (result!=null)
			return result;
		Iterator<EObject> contents = resource.getAllContents();
		 result = Lists.newArrayList();
		String _prefix=null;
		if( prefix!=null)
			_prefix =prefix+"->";
		
		UmlHelpers umlHelper = new UmlHelpers();
		
		while (contents.hasNext()) {
			EObject eObject = contents.next();
			IEObjectDescription desc = null;
			
			if ( eObject!=null) {
				EClass ec= eObject.eClass();
				EStructuralFeature  esf= null;
				esf=ec.getEStructuralFeature("qualifiedName");
				if (esf==null || !esf.isDerived())
					esf= ec.getEStructuralFeature("name");
				Object s=null;
				if (esf!=null)
					s=eObject.eGet(esf);
				else{
					s=ec.getName()+"_instanceWithNoName";
				}
				if (s instanceof String && _prefix!=null) {
					desc = new EObjectDescription(QualifiedName.create( _prefix+ s.toString()), eObject, null);
				}
				if (desc != null)
					result.add(desc);
				
				//getOperation from the object type (the metaclass) description
				
				ArrayList<EObject> objectMethods = new ArrayList<EObject>();
				ArrayList<String> objectMethodNames = new ArrayList<String>();
				for(EObject eo : eObject.eClass().eContents()){
					if (eo instanceof EOperation){
						objectMethods.add(eo);
						objectMethodNames.add(((EOperation) eo).getName()+"()");
						
					}
				}
				
				for (int i=0 ; i < objectMethodNames.size(); i++) {
					String sProp = objectMethodNames.get(i);
					desc = new EObjectDescription(QualifiedName.create( _prefix+ s.toString()+"::"+sProp), objectMethods.get(i), null);
					if (desc != null)
						result.add(desc);
				}
				
				//used to compute UML property attribute (mainly ports)...
				ArrayList<String> additionnalPropName = umlHelper.getPropertyNameToDisplayInXtext(eObject);
				ArrayList<EObject> additionnalProp = umlHelper.getPropertyToDisplayInXtext(eObject);
				for (int i=0 ; i < additionnalPropName.size(); i++) {
					String sProp = additionnalPropName.get(i);
					desc = new EObjectDescription(QualifiedName.create( _prefix+ s.toString()+"::"+sProp), additionnalProp.get(i), null);
					if (desc != null)
						result.add(desc);
				}
				
			}

			
		}
		return result;
	}

	public Iterable<QualifiedName> getImportedNames() {
		return null;
	}

	public Iterable<IReferenceDescription> getReferenceDescriptions() {
		return null;
	}

	public URI getURI() {
		return uri;
	}

}
