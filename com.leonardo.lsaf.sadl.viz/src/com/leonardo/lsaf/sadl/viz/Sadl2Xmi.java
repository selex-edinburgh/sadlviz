package com.leonardo.lsaf.sadl.viz;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.leonardo.lsaf.sadl.SADLStandaloneSetup;
import com.leonardo.lsaf.sadl.sadl.Connection;
import com.leonardo.lsaf.sadl.sadl.Model;
import com.leonardo.lsaf.sadl.sadl.Package;

public class Sadl2Xmi {

	public static void main(String[] args) {

		try {
			
//			File sourceModelFile = new File("nestedport.sadl");
			File sourceModelFile = new File("sample.sadl");
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			System.out.println("Converting " + sourceModelFile.getAbsolutePath() +" to "  +sourceModelFile.getAbsolutePath() + ".xmi ... ");
			Injector injector = new SADLStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelFile.getAbsolutePath()), true);
			
			TreeIterator<EObject> iterator = resource.getAllContents();
			while(iterator.hasNext()) {
				EObject eObject = iterator.next();
				System.out.println(eObject);
				if (eObject instanceof Connection) {
					Connection con = (Connection) eObject;
					System.out.println(con.getDestination().get(con.getDestination().size() - 1).getName());
					System.out.println(con.getSource().get(con.getSource().size() - 1).getName());
					System.out.println(con.getFrom().getName());
					System.out.println(con.getTo().getName());
					System.console();
				}
			}

			XMIResource xmiResource = new XMIResourceImpl(
					URI.createFileURI(sourceModelFile.getAbsolutePath() + ".xmi"));
			xmiResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));

//			xmiResource.save(null);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
