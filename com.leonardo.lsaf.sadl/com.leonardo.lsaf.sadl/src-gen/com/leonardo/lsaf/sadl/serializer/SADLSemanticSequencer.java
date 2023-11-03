/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.lsaf.sadl.serializer;

import com.google.inject.Inject;
import com.leonardo.lsaf.sadl.sadl.Alias;
import com.leonardo.lsaf.sadl.sadl.Application;
import com.leonardo.lsaf.sadl.sadl.Attribute;
import com.leonardo.lsaf.sadl.sadl.Component;
import com.leonardo.lsaf.sadl.sadl.ComponentInstance;
import com.leonardo.lsaf.sadl.sadl.Connection;
import com.leonardo.lsaf.sadl.sadl.ConnectionMapping;
import com.leonardo.lsaf.sadl.sadl.Container;
import com.leonardo.lsaf.sadl.sadl.ContainerInstance;
import com.leonardo.lsaf.sadl.sadl.ContainerMapping;
import com.leonardo.lsaf.sadl.sadl.Deployment;
import com.leonardo.lsaf.sadl.sadl.Enumeration;
import com.leonardo.lsaf.sadl.sadl.Enumerator;
import com.leonardo.lsaf.sadl.sadl.Interface;
import com.leonardo.lsaf.sadl.sadl.InterfacePort;
import com.leonardo.lsaf.sadl.sadl.Link;
import com.leonardo.lsaf.sadl.sadl.Model;
import com.leonardo.lsaf.sadl.sadl.Platform;
import com.leonardo.lsaf.sadl.sadl.Primitive;
import com.leonardo.lsaf.sadl.sadl.Processor;
import com.leonardo.lsaf.sadl.sadl.Property;
import com.leonardo.lsaf.sadl.sadl.PropertyValue;
import com.leonardo.lsaf.sadl.sadl.SadlPackage;
import com.leonardo.lsaf.sadl.sadl.Strategy;
import com.leonardo.lsaf.sadl.sadl.Topic;
import com.leonardo.lsaf.sadl.sadl.TopicPort;
import com.leonardo.lsaf.sadl.sadl.Transport;
import com.leonardo.lsaf.sadl.sadl.Unit;
import com.leonardo.lsaf.sadl.services.SADLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SADLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SADLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SadlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SadlPackage.ALIAS:
				sequence_Alias(context, (Alias) semanticObject); 
				return; 
			case SadlPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case SadlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SadlPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case SadlPackage.COMPONENT_INSTANCE:
				sequence_ComponentInstance(context, (ComponentInstance) semanticObject); 
				return; 
			case SadlPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case SadlPackage.CONNECTION_MAPPING:
				sequence_ConnectionMapping(context, (ConnectionMapping) semanticObject); 
				return; 
			case SadlPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case SadlPackage.CONTAINER_INSTANCE:
				sequence_ContainerInstance(context, (ContainerInstance) semanticObject); 
				return; 
			case SadlPackage.CONTAINER_MAPPING:
				sequence_ContainerMapping(context, (ContainerMapping) semanticObject); 
				return; 
			case SadlPackage.DEPLOYMENT:
				sequence_Deployment(context, (Deployment) semanticObject); 
				return; 
			case SadlPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case SadlPackage.ENUMERATOR:
				sequence_Enumerator(context, (Enumerator) semanticObject); 
				return; 
			case SadlPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case SadlPackage.INTERFACE_PORT:
				sequence_InterfacePort(context, (InterfacePort) semanticObject); 
				return; 
			case SadlPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case SadlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SadlPackage.PACKAGE:
				sequence_Package(context, (com.leonardo.lsaf.sadl.sadl.Package) semanticObject); 
				return; 
			case SadlPackage.PLATFORM:
				sequence_Platform(context, (Platform) semanticObject); 
				return; 
			case SadlPackage.PRIMITIVE:
				sequence_Primitive(context, (Primitive) semanticObject); 
				return; 
			case SadlPackage.PROCESSOR:
				sequence_Processor(context, (Processor) semanticObject); 
				return; 
			case SadlPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case SadlPackage.PROPERTY_VALUE:
				sequence_PropertyValue(context, (PropertyValue) semanticObject); 
				return; 
			case SadlPackage.STRATEGY:
				sequence_Strategy(context, (Strategy) semanticObject); 
				return; 
			case SadlPackage.TOPIC:
				sequence_Topic(context, (Topic) semanticObject); 
				return; 
			case SadlPackage.TOPIC_PORT:
				sequence_TopicPort(context, (TopicPort) semanticObject); 
				return; 
			case SadlPackage.TRANSPORT:
				sequence_Transport(context, (Transport) semanticObject); 
				return; 
			case SadlPackage.UNIT:
				sequence_Unit(context, (Unit) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Alias
	 *     Type returns Alias
	 *     Alias returns Alias
	 *
	 * Constraint:
	 *     (
	 *         type=[Type|QualifiedName] 
	 *         (min=Real max=Real res=Real?)? 
	 *         (unbounded='*' | upperbound=INT)? 
	 *         unit=[Unit|QualifiedName]? 
	 *         name=ID 
	 *         description=STRING?
	 *     )
	 * </pre>
	 */
	protected void sequence_Alias(ISerializationContext context, Alias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Application
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID description=STRING? containerInstances+=ContainerInstance*)
	 * </pre>
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         deprecated?='deprecated'? 
	 *         type=[Type|QualifiedName] 
	 *         name=ID 
	 *         (unbounded?='*' | lowerbound=INT | (lowerbound=INT (unbounded?='*' | upperbound=INT)))? 
	 *         unit=[Unit|QualifiedName]? 
	 *         description=STRING?
	 *     )
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ComponentInstance returns ComponentInstance
	 *
	 * Constraint:
	 *     (
	 *         type=[Component|QualifiedName] 
	 *         name=ID 
	 *         (unbounded?='*' | lowerBound=INT | (lowerBound=INT (unbounded?='*' | upperBound=INT)))? 
	 *         description=STRING?
	 *     )
	 * </pre>
	 */
	protected void sequence_ComponentInstance(ISerializationContext context, ComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID description=STRING? (parts+=ComponentInstance | ports+=Port)*)
	 * </pre>
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConnectionMapping returns ConnectionMapping
	 *
	 * Constraint:
	 *     (link=[Link|QualifiedName] connection=[Connection|QualifiedName])
	 * </pre>
	 */
	protected void sequence_ConnectionMapping(ISerializationContext context, ConnectionMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.CONNECTION_MAPPING__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.CONNECTION_MAPPING__LINK));
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.CONNECTION_MAPPING__CONNECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.CONNECTION_MAPPING__CONNECTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectionMappingAccess().getLinkLinkQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(SadlPackage.Literals.CONNECTION_MAPPING__LINK, false));
		feeder.accept(grammarAccess.getConnectionMappingAccess().getConnectionConnectionQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(SadlPackage.Literals.CONNECTION_MAPPING__CONNECTION, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns Connection
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         from=[ComponentInstance|QualifiedName]? 
	 *         source+=[Port|ID] 
	 *         source+=[Port|ID]* 
	 *         to=[ComponentInstance|QualifiedName]? 
	 *         destination+=[Port|ID] 
	 *         destination+=[Port|ID]* 
	 *         (strategy=[Strategy|ID] (value+=PropertyValue value+=PropertyValue*)?)? 
	 *         description=STRING?
	 *     )
	 * </pre>
	 */
	protected void sequence_Connection(ISerializationContext context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ContainerInstance returns ContainerInstance
	 *
	 * Constraint:
	 *     (type=[Container|QualifiedName] name=ID description=STRING?)
	 * </pre>
	 */
	protected void sequence_ContainerInstance(ISerializationContext context, ContainerInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ContainerMapping returns ContainerMapping
	 *
	 * Constraint:
	 *     (processor=[Processor|QualifiedName] container=[Container|QualifiedName])
	 * </pre>
	 */
	protected void sequence_ContainerMapping(ISerializationContext context, ContainerMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.CONTAINER_MAPPING__PROCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.CONTAINER_MAPPING__PROCESSOR));
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.CONTAINER_MAPPING__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.CONTAINER_MAPPING__CONTAINER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainerMappingAccess().getProcessorProcessorQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(SadlPackage.Literals.CONTAINER_MAPPING__PROCESSOR, false));
		feeder.accept(grammarAccess.getContainerMappingAccess().getContainerContainerQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(SadlPackage.Literals.CONTAINER_MAPPING__CONTAINER, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Container
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (name=ID description=STRING? (componentInstances+=ComponentInstance | connections+=Connection | containerInstances+=ContainerInstance)*)
	 * </pre>
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Deployment
	 *     Deployment returns Deployment
	 *
	 * Constraint:
	 *     (name=ID description=STRING? (containermapping+=ContainerMapping | connectionmapping+=ConnectionMapping)*)
	 * </pre>
	 */
	protected void sequence_Deployment(ISerializationContext context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Enumeration
	 *     Type returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID description=STRING? enumerators+=Enumerator*)
	 * </pre>
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Enumerator returns Enumerator
	 *
	 * Constraint:
	 *     (deprecated?='deprecated'? name=ID value=INT? description=STRING?)
	 * </pre>
	 */
	protected void sequence_Enumerator(ISerializationContext context, Enumerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Port returns InterfacePort
	 *     InterfacePort returns InterfacePort
	 *
	 * Constraint:
	 *     (name=ID conjugated?='requires'? type=[Interface|QualifiedName])
	 * </pre>
	 */
	protected void sequence_InterfacePort(ISerializationContext context, InterfacePort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (name=ID description=STRING? ports+=Port*)
	 * </pre>
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         (processors+=[Processor|QualifiedName] processors+=[Processor|QualifiedName]*)? 
	 *         (transport=[Transport|ID] (value+=PropertyValue value+=PropertyValue*)?)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     package+=Package*
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=QualifiedName description=STRING? contents+=PackageableElement*)
	 * </pre>
	 */
	protected void sequence_Package(ISerializationContext context, com.leonardo.lsaf.sadl.sadl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Platform
	 *     Platform returns Platform
	 *
	 * Constraint:
	 *     (name=ID description=STRING? (processors+=Processor | links+=Link)*)
	 * </pre>
	 */
	protected void sequence_Platform(ISerializationContext context, Platform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Primitive
	 *     Type returns Primitive
	 *     Primitive returns Primitive
	 *
	 * Constraint:
	 *     (name=ID (min=Real max=Real res=Real?)?)
	 * </pre>
	 */
	protected void sequence_Primitive(ISerializationContext context, Primitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Processor returns Processor
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 * </pre>
	 */
	protected void sequence_Processor(ISerializationContext context, Processor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PropertyValue returns PropertyValue
	 *
	 * Constraint:
	 *     (property=[Property|ID] value=STRING)
	 * </pre>
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.PROPERTY_VALUE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.PROPERTY_VALUE__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, SadlPackage.Literals.PROPERTY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SadlPackage.Literals.PROPERTY_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyValueAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SadlPackage.Literals.PROPERTY_VALUE__PROPERTY, false));
		feeder.accept(grammarAccess.getPropertyValueAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=ID optional?='?'? description=STRING?)
	 * </pre>
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Strategy
	 *     Strategy returns Strategy
	 *
	 * Constraint:
	 *     (name=ID description=STRING? properties+=Property*)
	 * </pre>
	 */
	protected void sequence_Strategy(ISerializationContext context, Strategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Port returns TopicPort
	 *     TopicPort returns TopicPort
	 *
	 * Constraint:
	 *     (name=ID conjugated?='receives'? type=[Topic|QualifiedName])
	 * </pre>
	 */
	protected void sequence_TopicPort(ISerializationContext context, TopicPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Topic
	 *     Type returns Topic
	 *     Topic returns Topic
	 *
	 * Constraint:
	 *     (name=ID description=STRING? attributes+=Attribute*)
	 * </pre>
	 */
	protected void sequence_Topic(ISerializationContext context, Topic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Transport
	 *     Transport returns Transport
	 *
	 * Constraint:
	 *     (name=ID description=STRING? properties+=Property*)
	 * </pre>
	 */
	protected void sequence_Transport(ISerializationContext context, Transport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackageableElement returns Unit
	 *     Unit returns Unit
	 *
	 * Constraint:
	 *     (name=ID group=[Unit|QualifiedName]? description=STRING?)
	 * </pre>
	 */
	protected void sequence_Unit(ISerializationContext context, Unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
