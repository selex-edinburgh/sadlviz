/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.lsaf.sadl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.leonardo.lsaf.sadl.ide.contentassist.antlr.internal.InternalSADLParser;
import com.leonardo.lsaf.sadl.services.SADLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SADLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SADLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SADLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackageableElementAccess().getAlternatives(), "rule__PackageableElement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getRealAccess().getAlternatives_3(), "rule__Real__Alternatives_3");
			builder.put(grammarAccess.getAliasAccess().getAlternatives_3(), "rule__Alias__Alternatives_3");
			builder.put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
			builder.put(grammarAccess.getEnumeratorAccess().getAlternatives_0(), "rule__Enumerator__Alternatives_0");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives_0(), "rule__Attribute__Alternatives_0");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives_3(), "rule__Attribute__Alternatives_3");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives_3_2_0_2(), "rule__Attribute__Alternatives_3_2_0_2");
			builder.put(grammarAccess.getTopicPortAccess().getAlternatives_2(), "rule__TopicPort__Alternatives_2");
			builder.put(grammarAccess.getInterfacePortAccess().getAlternatives_2(), "rule__InterfacePort__Alternatives_2");
			builder.put(grammarAccess.getPlatformAccess().getAlternatives_3(), "rule__Platform__Alternatives_3");
			builder.put(grammarAccess.getContainerAccess().getAlternatives_3(), "rule__Container__Alternatives_3");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_3(), "rule__Component__Alternatives_3");
			builder.put(grammarAccess.getComponentInstanceAccess().getAlternatives_3_1(), "rule__ComponentInstance__Alternatives_3_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getAlternatives_3_1_2_2(), "rule__ComponentInstance__Alternatives_3_1_2_2");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives_3(), "rule__Connection__Alternatives_3");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives_8(), "rule__Connection__Alternatives_8");
			builder.put(grammarAccess.getDeploymentAccess().getAlternatives_3(), "rule__Deployment__Alternatives_3");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getUnitAccess().getGroup(), "rule__Unit__Group__0");
			builder.put(grammarAccess.getUnitAccess().getGroup_2(), "rule__Unit__Group_2__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup(), "rule__Primitive__Group__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_2(), "rule__Primitive__Group_2__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_2_2(), "rule__Primitive__Group_2_2__0");
			builder.put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
			builder.put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
			builder.put(grammarAccess.getAliasAccess().getGroup(), "rule__Alias__Group__0");
			builder.put(grammarAccess.getAliasAccess().getGroup_2(), "rule__Alias__Group_2__0");
			builder.put(grammarAccess.getAliasAccess().getGroup_2_2(), "rule__Alias__Group_2_2__0");
			builder.put(grammarAccess.getAliasAccess().getGroup_3_0(), "rule__Alias__Group_3_0__0");
			builder.put(grammarAccess.getAliasAccess().getGroup_3_1(), "rule__Alias__Group_3_1__0");
			builder.put(grammarAccess.getAliasAccess().getGroup_4(), "rule__Alias__Group_4__0");
			builder.put(grammarAccess.getEnumeratorAccess().getGroup(), "rule__Enumerator__Group__0");
			builder.put(grammarAccess.getEnumeratorAccess().getGroup_2(), "rule__Enumerator__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_3_0(), "rule__Attribute__Group_3_0__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_3_2(), "rule__Attribute__Group_3_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_3_2_0(), "rule__Attribute__Group_3_2_0__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
			builder.put(grammarAccess.getTopicPortAccess().getGroup(), "rule__TopicPort__Group__0");
			builder.put(grammarAccess.getInterfacePortAccess().getGroup(), "rule__InterfacePort__Group__0");
			builder.put(grammarAccess.getPlatformAccess().getGroup(), "rule__Platform__Group__0");
			builder.put(grammarAccess.getProcessorAccess().getGroup(), "rule__Processor__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3(), "rule__Link__Group_3__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3_3(), "rule__Link__Group_3_3__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_4(), "rule__Link__Group_4__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_4_2(), "rule__Link__Group_4_2__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_4_2_2(), "rule__Link__Group_4_2_2__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getPropertyValueAccess().getGroup(), "rule__PropertyValue__Group__0");
			builder.put(grammarAccess.getTransportAccess().getGroup(), "rule__Transport__Group__0");
			builder.put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getContainerInstanceAccess().getGroup(), "rule__ContainerInstance__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentInstanceAccess().getGroup(), "rule__ComponentInstance__Group__0");
			builder.put(grammarAccess.getComponentInstanceAccess().getGroup_3(), "rule__ComponentInstance__Group_3__0");
			builder.put(grammarAccess.getComponentInstanceAccess().getGroup_3_1_2(), "rule__ComponentInstance__Group_3_1_2__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_6(), "rule__Connection__Group_6__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_11(), "rule__Connection__Group_11__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_13(), "rule__Connection__Group_13__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_13_2(), "rule__Connection__Group_13_2__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_13_2_2(), "rule__Connection__Group_13_2_2__0");
			builder.put(grammarAccess.getDeploymentAccess().getGroup(), "rule__Deployment__Group__0");
			builder.put(grammarAccess.getContainerMappingAccess().getGroup(), "rule__ContainerMapping__Group__0");
			builder.put(grammarAccess.getConnectionMappingAccess().getGroup(), "rule__ConnectionMapping__Group__0");
			builder.put(grammarAccess.getStrategyAccess().getGroup(), "rule__Strategy__Group__0");
			builder.put(grammarAccess.getModelAccess().getPackageAssignment_1(), "rule__Model__PackageAssignment_1");
			builder.put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
			builder.put(grammarAccess.getPackageAccess().getDescriptionAssignment_2(), "rule__Package__DescriptionAssignment_2");
			builder.put(grammarAccess.getPackageAccess().getContentsAssignment_3(), "rule__Package__ContentsAssignment_3");
			builder.put(grammarAccess.getUnitAccess().getNameAssignment_1(), "rule__Unit__NameAssignment_1");
			builder.put(grammarAccess.getUnitAccess().getGroupAssignment_2_1(), "rule__Unit__GroupAssignment_2_1");
			builder.put(grammarAccess.getUnitAccess().getDescriptionAssignment_3(), "rule__Unit__DescriptionAssignment_3");
			builder.put(grammarAccess.getPrimitiveAccess().getNameAssignment_1(), "rule__Primitive__NameAssignment_1");
			builder.put(grammarAccess.getPrimitiveAccess().getMinAssignment_2_0(), "rule__Primitive__MinAssignment_2_0");
			builder.put(grammarAccess.getPrimitiveAccess().getMaxAssignment_2_1(), "rule__Primitive__MaxAssignment_2_1");
			builder.put(grammarAccess.getPrimitiveAccess().getResAssignment_2_2_1(), "rule__Primitive__ResAssignment_2_2_1");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceAccess().getDescriptionAssignment_2(), "rule__Interface__DescriptionAssignment_2");
			builder.put(grammarAccess.getInterfaceAccess().getPortsAssignment_3(), "rule__Interface__PortsAssignment_3");
			builder.put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
			builder.put(grammarAccess.getEnumerationAccess().getDescriptionAssignment_2(), "rule__Enumeration__DescriptionAssignment_2");
			builder.put(grammarAccess.getEnumerationAccess().getEnumeratorsAssignment_3(), "rule__Enumeration__EnumeratorsAssignment_3");
			builder.put(grammarAccess.getTopicAccess().getNameAssignment_1(), "rule__Topic__NameAssignment_1");
			builder.put(grammarAccess.getTopicAccess().getDescriptionAssignment_2(), "rule__Topic__DescriptionAssignment_2");
			builder.put(grammarAccess.getTopicAccess().getAttributesAssignment_3(), "rule__Topic__AttributesAssignment_3");
			builder.put(grammarAccess.getAliasAccess().getTypeAssignment_1(), "rule__Alias__TypeAssignment_1");
			builder.put(grammarAccess.getAliasAccess().getMinAssignment_2_0(), "rule__Alias__MinAssignment_2_0");
			builder.put(grammarAccess.getAliasAccess().getMaxAssignment_2_1(), "rule__Alias__MaxAssignment_2_1");
			builder.put(grammarAccess.getAliasAccess().getResAssignment_2_2_1(), "rule__Alias__ResAssignment_2_2_1");
			builder.put(grammarAccess.getAliasAccess().getUnboundedAssignment_3_0_1(), "rule__Alias__UnboundedAssignment_3_0_1");
			builder.put(grammarAccess.getAliasAccess().getUpperboundAssignment_3_1_0(), "rule__Alias__UpperboundAssignment_3_1_0");
			builder.put(grammarAccess.getAliasAccess().getUnitAssignment_4_1(), "rule__Alias__UnitAssignment_4_1");
			builder.put(grammarAccess.getAliasAccess().getNameAssignment_6(), "rule__Alias__NameAssignment_6");
			builder.put(grammarAccess.getAliasAccess().getDescriptionAssignment_7(), "rule__Alias__DescriptionAssignment_7");
			builder.put(grammarAccess.getEnumeratorAccess().getDeprecatedAssignment_0_1(), "rule__Enumerator__DeprecatedAssignment_0_1");
			builder.put(grammarAccess.getEnumeratorAccess().getNameAssignment_1(), "rule__Enumerator__NameAssignment_1");
			builder.put(grammarAccess.getEnumeratorAccess().getValueAssignment_2_1(), "rule__Enumerator__ValueAssignment_2_1");
			builder.put(grammarAccess.getEnumeratorAccess().getDescriptionAssignment_3(), "rule__Enumerator__DescriptionAssignment_3");
			builder.put(grammarAccess.getAttributeAccess().getDeprecatedAssignment_0_1(), "rule__Attribute__DeprecatedAssignment_0_1");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_1(), "rule__Attribute__TypeAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getUnboundedAssignment_3_0_1(), "rule__Attribute__UnboundedAssignment_3_0_1");
			builder.put(grammarAccess.getAttributeAccess().getLowerboundAssignment_3_1(), "rule__Attribute__LowerboundAssignment_3_1");
			builder.put(grammarAccess.getAttributeAccess().getLowerboundAssignment_3_2_0_0(), "rule__Attribute__LowerboundAssignment_3_2_0_0");
			builder.put(grammarAccess.getAttributeAccess().getUnboundedAssignment_3_2_0_2_0(), "rule__Attribute__UnboundedAssignment_3_2_0_2_0");
			builder.put(grammarAccess.getAttributeAccess().getUpperboundAssignment_3_2_0_2_1(), "rule__Attribute__UpperboundAssignment_3_2_0_2_1");
			builder.put(grammarAccess.getAttributeAccess().getUnitAssignment_4_1(), "rule__Attribute__UnitAssignment_4_1");
			builder.put(grammarAccess.getAttributeAccess().getDescriptionAssignment_5(), "rule__Attribute__DescriptionAssignment_5");
			builder.put(grammarAccess.getTopicPortAccess().getNameAssignment_1(), "rule__TopicPort__NameAssignment_1");
			builder.put(grammarAccess.getTopicPortAccess().getConjugatedAssignment_2_0(), "rule__TopicPort__ConjugatedAssignment_2_0");
			builder.put(grammarAccess.getTopicPortAccess().getTypeAssignment_3(), "rule__TopicPort__TypeAssignment_3");
			builder.put(grammarAccess.getInterfacePortAccess().getNameAssignment_1(), "rule__InterfacePort__NameAssignment_1");
			builder.put(grammarAccess.getInterfacePortAccess().getConjugatedAssignment_2_0(), "rule__InterfacePort__ConjugatedAssignment_2_0");
			builder.put(grammarAccess.getInterfacePortAccess().getTypeAssignment_3(), "rule__InterfacePort__TypeAssignment_3");
			builder.put(grammarAccess.getPlatformAccess().getNameAssignment_1(), "rule__Platform__NameAssignment_1");
			builder.put(grammarAccess.getPlatformAccess().getDescriptionAssignment_2(), "rule__Platform__DescriptionAssignment_2");
			builder.put(grammarAccess.getPlatformAccess().getProcessorsAssignment_3_0(), "rule__Platform__ProcessorsAssignment_3_0");
			builder.put(grammarAccess.getPlatformAccess().getLinksAssignment_3_1(), "rule__Platform__LinksAssignment_3_1");
			builder.put(grammarAccess.getProcessorAccess().getNameAssignment_1(), "rule__Processor__NameAssignment_1");
			builder.put(grammarAccess.getProcessorAccess().getDescriptionAssignment_2(), "rule__Processor__DescriptionAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
			builder.put(grammarAccess.getLinkAccess().getDescriptionAssignment_2(), "rule__Link__DescriptionAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getProcessorsAssignment_3_2(), "rule__Link__ProcessorsAssignment_3_2");
			builder.put(grammarAccess.getLinkAccess().getProcessorsAssignment_3_3_1(), "rule__Link__ProcessorsAssignment_3_3_1");
			builder.put(grammarAccess.getLinkAccess().getTransportAssignment_4_1(), "rule__Link__TransportAssignment_4_1");
			builder.put(grammarAccess.getLinkAccess().getValueAssignment_4_2_1(), "rule__Link__ValueAssignment_4_2_1");
			builder.put(grammarAccess.getLinkAccess().getValueAssignment_4_2_2_1(), "rule__Link__ValueAssignment_4_2_2_1");
			builder.put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
			builder.put(grammarAccess.getPropertyAccess().getOptionalAssignment_2(), "rule__Property__OptionalAssignment_2");
			builder.put(grammarAccess.getPropertyAccess().getDescriptionAssignment_3(), "rule__Property__DescriptionAssignment_3");
			builder.put(grammarAccess.getPropertyValueAccess().getPropertyAssignment_0(), "rule__PropertyValue__PropertyAssignment_0");
			builder.put(grammarAccess.getPropertyValueAccess().getValueAssignment_2(), "rule__PropertyValue__ValueAssignment_2");
			builder.put(grammarAccess.getTransportAccess().getNameAssignment_1(), "rule__Transport__NameAssignment_1");
			builder.put(grammarAccess.getTransportAccess().getDescriptionAssignment_2(), "rule__Transport__DescriptionAssignment_2");
			builder.put(grammarAccess.getTransportAccess().getPropertiesAssignment_3(), "rule__Transport__PropertiesAssignment_3");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
			builder.put(grammarAccess.getApplicationAccess().getDescriptionAssignment_2(), "rule__Application__DescriptionAssignment_2");
			builder.put(grammarAccess.getApplicationAccess().getContainerInstancesAssignment_3(), "rule__Application__ContainerInstancesAssignment_3");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_1(), "rule__Container__NameAssignment_1");
			builder.put(grammarAccess.getContainerAccess().getDescriptionAssignment_2(), "rule__Container__DescriptionAssignment_2");
			builder.put(grammarAccess.getContainerAccess().getComponentInstancesAssignment_3_0(), "rule__Container__ComponentInstancesAssignment_3_0");
			builder.put(grammarAccess.getContainerAccess().getConnectionsAssignment_3_1(), "rule__Container__ConnectionsAssignment_3_1");
			builder.put(grammarAccess.getContainerAccess().getContainerInstancesAssignment_3_2(), "rule__Container__ContainerInstancesAssignment_3_2");
			builder.put(grammarAccess.getContainerInstanceAccess().getTypeAssignment_1(), "rule__ContainerInstance__TypeAssignment_1");
			builder.put(grammarAccess.getContainerInstanceAccess().getNameAssignment_2(), "rule__ContainerInstance__NameAssignment_2");
			builder.put(grammarAccess.getContainerInstanceAccess().getDescriptionAssignment_3(), "rule__ContainerInstance__DescriptionAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getDescriptionAssignment_2(), "rule__Component__DescriptionAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getPartsAssignment_3_0(), "rule__Component__PartsAssignment_3_0");
			builder.put(grammarAccess.getComponentAccess().getPortsAssignment_3_1(), "rule__Component__PortsAssignment_3_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getTypeAssignment_1(), "rule__ComponentInstance__TypeAssignment_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getNameAssignment_2(), "rule__ComponentInstance__NameAssignment_2");
			builder.put(grammarAccess.getComponentInstanceAccess().getUnboundedAssignment_3_1_0(), "rule__ComponentInstance__UnboundedAssignment_3_1_0");
			builder.put(grammarAccess.getComponentInstanceAccess().getLowerBoundAssignment_3_1_1(), "rule__ComponentInstance__LowerBoundAssignment_3_1_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getLowerBoundAssignment_3_1_2_0(), "rule__ComponentInstance__LowerBoundAssignment_3_1_2_0");
			builder.put(grammarAccess.getComponentInstanceAccess().getUnboundedAssignment_3_1_2_2_0(), "rule__ComponentInstance__UnboundedAssignment_3_1_2_2_0");
			builder.put(grammarAccess.getComponentInstanceAccess().getUpperBoundAssignment_3_1_2_2_1(), "rule__ComponentInstance__UpperBoundAssignment_3_1_2_2_1");
			builder.put(grammarAccess.getComponentInstanceAccess().getDescriptionAssignment_4(), "rule__ComponentInstance__DescriptionAssignment_4");
			builder.put(grammarAccess.getConnectionAccess().getNameAssignment_1(), "rule__Connection__NameAssignment_1");
			builder.put(grammarAccess.getConnectionAccess().getFromAssignment_3_1(), "rule__Connection__FromAssignment_3_1");
			builder.put(grammarAccess.getConnectionAccess().getSourceAssignment_5(), "rule__Connection__SourceAssignment_5");
			builder.put(grammarAccess.getConnectionAccess().getSourceAssignment_6_1(), "rule__Connection__SourceAssignment_6_1");
			builder.put(grammarAccess.getConnectionAccess().getToAssignment_8_1(), "rule__Connection__ToAssignment_8_1");
			builder.put(grammarAccess.getConnectionAccess().getDestinationAssignment_10(), "rule__Connection__DestinationAssignment_10");
			builder.put(grammarAccess.getConnectionAccess().getDestinationAssignment_11_1(), "rule__Connection__DestinationAssignment_11_1");
			builder.put(grammarAccess.getConnectionAccess().getStrategyAssignment_13_1(), "rule__Connection__StrategyAssignment_13_1");
			builder.put(grammarAccess.getConnectionAccess().getValueAssignment_13_2_1(), "rule__Connection__ValueAssignment_13_2_1");
			builder.put(grammarAccess.getConnectionAccess().getValueAssignment_13_2_2_1(), "rule__Connection__ValueAssignment_13_2_2_1");
			builder.put(grammarAccess.getConnectionAccess().getDescriptionAssignment_14(), "rule__Connection__DescriptionAssignment_14");
			builder.put(grammarAccess.getDeploymentAccess().getNameAssignment_1(), "rule__Deployment__NameAssignment_1");
			builder.put(grammarAccess.getDeploymentAccess().getDescriptionAssignment_2(), "rule__Deployment__DescriptionAssignment_2");
			builder.put(grammarAccess.getDeploymentAccess().getContainermappingAssignment_3_0(), "rule__Deployment__ContainermappingAssignment_3_0");
			builder.put(grammarAccess.getDeploymentAccess().getConnectionmappingAssignment_3_1(), "rule__Deployment__ConnectionmappingAssignment_3_1");
			builder.put(grammarAccess.getContainerMappingAccess().getProcessorAssignment_0(), "rule__ContainerMapping__ProcessorAssignment_0");
			builder.put(grammarAccess.getContainerMappingAccess().getContainerAssignment_2(), "rule__ContainerMapping__ContainerAssignment_2");
			builder.put(grammarAccess.getConnectionMappingAccess().getLinkAssignment_0(), "rule__ConnectionMapping__LinkAssignment_0");
			builder.put(grammarAccess.getConnectionMappingAccess().getConnectionAssignment_2(), "rule__ConnectionMapping__ConnectionAssignment_2");
			builder.put(grammarAccess.getStrategyAccess().getNameAssignment_1(), "rule__Strategy__NameAssignment_1");
			builder.put(grammarAccess.getStrategyAccess().getDescriptionAssignment_2(), "rule__Strategy__DescriptionAssignment_2");
			builder.put(grammarAccess.getStrategyAccess().getPropertiesAssignment_3(), "rule__Strategy__PropertiesAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SADLGrammarAccess grammarAccess;

	@Override
	protected InternalSADLParser createParser() {
		InternalSADLParser result = new InternalSADLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SADLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SADLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
