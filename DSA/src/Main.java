public class Main {

    public static void main(String[] args) {
        String s= "Link{a=Point{entity=<com.ossnms.bicnet.bcb.facade.elementMgmt.PhysicalTerminationPointItem, optionalFacets=[<com.ossnms.bicnet.bcb.facade.elementMgmt.EquipmentStatePkgItem equipmentState=7>, <com.ossnms.bicnet.bcb.facade.elementMgmt.CustomLabelPkgItem customLabel=>, <com.ossnms.bicnet.bcb.facade.elementMgmt.TrafficFlowControlPkgItem trafficFlowStopperState=0, affectsLaserState=false>, <com.ossnms.bicnet.bcb.facade.elementMgmt.LinkDiscoveryPkgItem linkDiscoveryIds=[1-4-dwdm]>, <com.ossnms.bicnet.bcb.facade.elementMgmt.WebGuiContextPkgItem webGuiContext=view=optical-ptp&action=edit&optical-ptp_name=1-4-dwdm>, <com.ossnms.bicnet.bcb.facade.elementMgmt.AddDropAttenuationPkgItem receivedCarrierAttenuation=10.0, transmittedCarrierAttenuation=0.0, receivedCarrierAttenuationConfigurable=false, attenuationSourceExternal=true>] , parentNeId=61, ptpId=-7994710587294499431, protectionType=null, supportingEquipment=[<parentNeId=61, eqId=-1196325818, >], capabilities=[fullAlarmReport, pmPoints, transmitter, receiver, connectable, portConnectionInfo], operationalStateSource=1, operationalStateSink=1, directionId=0, provisioningMode=3, crossConnectable=false, locatedOnEquipmentMatchingPlannedType=true, partnerPortId=0, internalExpectedTTI=0, internalTransmittedTTI=0, isValidCrossConnectable=false, supportedProvisioningModes=[], protectionRole=null, subportRelation=0, adminState=2, configurableAdminState=true, adminStateSupportedValues=[locked, unlocked, maintenance], terminationPointType=13202, objectLocation=1-4.dwdm, physicalLocation=|b1|d4|fdwdm|, nativeLocation=optical-ptp-1-4-dwdm, alarmMonitoring=8>, layer=10, id='10, key=ne=61|ptp=-7994710587294499431', protectionState=WORKING, active=true, optional=false, additionalInfo=null, consumedCrumbPoints=-1, hash=-391192917, isGeneric=false, significantLayers=[12, 13]}, z=Point{entity=<com.ossnms.bicnet.bcb.facade.elementMgmt.PhysicalTerminationPointItem, optionalFacets=[<com.ossnms.bicnet.bcb.facade.elementMgmt.EquipmentStatePkgItem equipmentState=6>, <com.ossnms.bicnet.bcb.facade.elementMgmt.FilterPortRoleFacetItem filterPortRole=2, configurable=false, configurableFilterPortRoles=[tributary, generalPurpose, multiTributary]>, <com.ossnms.bicnet.bcb.facade.elementMgmt.CustomLabelPkgItem customLabel=>, <com.ossnms.bicnet.bcb.facade.elementMgmt.TrafficFlowControlPkgItem trafficFlowStopperState=0, affectsLaserState=false>, <com.ossnms.bicnet.bcb.facade.elementMgmt.LinkDiscoveryPkgItem linkDiscoveryIds=[1-1-ade2]>, <com.ossnms.bicnet.bcb.facade.elementMgmt.WebGuiContextPkgItem webGuiContext=view=optical-ptp&action=edit&optical-ptp_name=1-1-ade2>] , parentNeId=61, ptpId=-3319151193522089006, protectionType=null, supportingEquipment=[<parentNeId=61, eqId=1035951952, >], capabilities=[fullAlarmReport, pmPoints, transmitter, receiver, connectable, portConnectionInfo, availableWavelengthsOnTps, omsSpanLossUnavailable], operationalStateSource=2, operationalStateSink=2, directionId=0, provisioningMode=3, crossConnectable=false, locatedOnEquipmentMatchingPlannedType=true, partnerPortId=0, internalExpectedTTI=0, internalTransmittedTTI=0, isValidCrossConnectable=false, supportedProvisioningModes=[], protectionRole=null, subportRelation=0, adminState=2, configurableAdminState=true, adminStateSupportedValues=[locked, unlocked, maintenance], terminationPointType=13190, objectLocation=1-1.ade2, physicalLocation=|b1|d1|f2|, nativeLocation=optical-ptp-1-1-ade2, alarmMonitoring=8>, layer=10, id='10, key=ne=61|ptp=-3319151193522089006', protectionState=WORKING, active=true, optional=false, additionalInfo=null, consumedCrumbPoints=0, hash=180997703, isGeneric=false, significantLayers=[12, 13]}, directionality=BIDIRECTIONAL}";

        String split[]=s.split("receivedCarrierAttenuation");
        double attenuationValue=0;
if(split.length>1  ){
    String sp[]=split[1].split("=");
    if(sp.length>1){
        sp=sp[1].split(",");
        if(sp.length>0){
            attenuationValue=Double.parseDouble(sp[0]);
        }
    }
}
        System.out.println(attenuationValue);



    }
}