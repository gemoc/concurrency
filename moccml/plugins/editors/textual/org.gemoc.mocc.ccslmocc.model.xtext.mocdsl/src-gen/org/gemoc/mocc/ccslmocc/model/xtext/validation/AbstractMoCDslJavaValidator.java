/*
* generated by Xtext
*/
package org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractMoCDslJavaValidator extends org.eclipse.gemoc.moccml.constraint.fsmkernel.model.xtext.validation.FSMDslJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.gemoc.moccml/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel.ccslmodel.clockexpressionandrelation"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.gemoc.moccml.fsmmodel/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://org.gemoc.mocc.fsmmodel/editionextension/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel.classicalexpression"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel.basicTypes"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel.ccslmodel.clockexpressionandrelation.kernelexpression"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://fr.inria.aoste.timemodel.ccslmodel.clockexpressionandrelation.kernelrelation"));
		return result;
	}

}
