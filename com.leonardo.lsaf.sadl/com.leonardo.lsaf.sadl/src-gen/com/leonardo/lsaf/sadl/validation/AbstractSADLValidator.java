/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.lsaf.sadl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSADLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.leonardo.lsaf.sadl.sadl.SadlPackage.eINSTANCE);
		return result;
	}
}
