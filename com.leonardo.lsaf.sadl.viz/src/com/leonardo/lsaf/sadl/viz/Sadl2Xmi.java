package com.leonardo.lsaf.sadl.viz;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.leonardo.lsaf.sadl.SADLStandaloneSetup;
import com.leonardo.lsaf.sadl.sadl.Attribute;
import com.leonardo.lsaf.sadl.sadl.Primitive;

public class Sadl2Xmi {

  public static void main(String[] args) {

    try {
//         for (Entry<String, Object> entry : EPackage.Registry.INSTANCE.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue().getClass().getName());
//         }

//         File sourceModelFile = new File("nestedport.sadl");
      File sourceModelFile = new File("sample.sadl");
//         new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri(".");
//         new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
      System.out.println(
          "Converting " + sourceModelFile.getAbsolutePath() + " to " + sourceModelFile.getAbsolutePath() + ".xmi ... ");
      Injector injector = new SADLStandaloneSetup().createInjectorAndDoEMFRegistration();

      for (Entry<String, Object> entry : EPackage.Registry.INSTANCE.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue().getClass().getName());
      }

      XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelFile.getAbsolutePath()), true);

//      Set<EObject> eObjects = new HashSet<>();   
//         
      TreeIterator<EObject> iterator = resource.getAllContents();
//      while (iterator.hasNext()) {
//        eObjects.add(iterator.next());
//      }
      
      iterator = resource.getAllContents();
      while (iterator.hasNext()) {
        EObject eObject = iterator.next();
        
        eObject.eCrossReferences();
        
        Collection<Setting> objects = EcoreUtil.UsageCrossReferencer.find(eObject, resource);
        for( Setting entry : objects) {
          System.out.println(eObject.eClass().getName() + " : " + entry.getEObject().eClass().getName() + "." + entry.getEStructuralFeature().getName());
          
        }
        
//        EContentsEList.FeatureIterator featureIterator = (EContentsEList.FeatureIterator) eObject.eCrossReferences().iterator();
//        while(featureIterator.hasNext()) {
//          
//          if (eObject instanceof Attribute) {
////            System.out.println(((Attribute)eObject).getName());
//          }
//          EObject obj = (EObject) featureIterator.next();
//          EReference eReference = (EReference) featureIterator.feature();
//          if (obj instanceof Primitive) {
//            System.out.println(((Primitive)obj).getName());
//          }
//          System.out.println(eObject.eClass().getName() + "." + eReference.getName() + " : " + obj.eClass().getName());
//        }
      }

      XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(sourceModelFile.getAbsolutePath() + ".xmi"));
      xmiResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));

      xmiResource.save(null);
      System.out.println("Done");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
