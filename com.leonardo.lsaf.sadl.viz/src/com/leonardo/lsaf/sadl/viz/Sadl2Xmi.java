package com.leonardo.lsaf.sadl.viz;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.leonardo.lsaf.sadl.SADLStandaloneSetup;

public class Sadl2Xmi {

	public static void main(String[] args) {

		try {
			File sourceModelFile = new File("nestedport.sadl");
			System.out.println("Converting " + sourceModelFile.getAbsolutePath() +" to "  +sourceModelFile.getAbsolutePath() + ".xmi ... ");
			Injector injector = new SADLStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			Resource resource = resourceSet.createResource(URI.createFileURI(sourceModelFile.getAbsolutePath()), null);
			resource.load(null);

			XMIResource xmiResource = new XMIResourceImpl(
					URI.createFileURI(sourceModelFile.getAbsolutePath() + ".xmi"));
			xmiResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));
			xmiResource.save(null);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
