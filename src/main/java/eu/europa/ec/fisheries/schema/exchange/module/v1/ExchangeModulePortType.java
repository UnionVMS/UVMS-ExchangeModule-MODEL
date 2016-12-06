package eu.europa.ec.fisheries.schema.exchange.module.v1;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-12-06T12:37:39.617+01:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", name = "ExchangeModulePortType")
@XmlSeeAlso({eu.europa.ec.fisheries.schema.exchange.movement.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.asset.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.movement.mobileterminal.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.ObjectFactory.class, ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.common.v1.ObjectFactory.class, eu.europa.ec.fisheries.schema.exchange.service.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExchangeModulePortType {

    @Oneway
    @WebMethod(operationName = "SetMovementReport")
    public void setMovementReport(
        @WebParam(partName = "body", name = "SetMovementReportRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        SetMovementReportRequest body
    ) throws ExchangeFault;

    @WebResult(name = "GetServiceListResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "GetServiceList")
    public GetServiceListResponse getServiceList(
        @WebParam(partName = "body", name = "GetServiceListRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        GetServiceListRequest body
    ) throws ExchangeFault;

    @WebResult(name = "SetCommandResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "CreatePoll")
    public SetCommandResponse createPoll(
        @WebParam(partName = "body", name = "SetCommandRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        SetCommandRequest body
    ) throws ExchangeFault;

    @WebResult(name = "pingResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "Ping")
    public PingResponse ping(
        @WebParam(partName = "body", name = "pingRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        PingRequest body
    );

    @Oneway
    @WebMethod(operationName = "ProcessedMovement")
    public void processedMovement(
        @WebParam(partName = "body", name = "ProcessedMovementResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        ProcessedMovementResponse body
    );

    @WebResult(name = "UpdatePluginSettingResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "UpdatePluginSetting")
    public UpdatePluginSettingResponse updatePluginSetting(
        @WebParam(partName = "body", name = "UpdatePluginSettingRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        UpdatePluginSettingRequest body
    ) throws ExchangeFault;

    @WebResult(name = "SendMovementToPluginResponse", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1", partName = "body")
    @WebMethod(operationName = "SendMovementToPlugin")
    public SendMovementToPluginResponse sendMovementToPlugin(
        @WebParam(partName = "body", name = "SendMovementToPluginRequest", targetNamespace = "urn:module.exchange.schema.fisheries.ec.europa.eu:v1")
        SendMovementToPluginRequest body
    ) throws ExchangeFault;
}
