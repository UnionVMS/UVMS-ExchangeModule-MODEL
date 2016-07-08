/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.exchange.model.mapper;

import javax.xml.datatype.XMLGregorianCalendar;

import eu.europa.ec.fisheries.schema.exchange.common.v1.CommandType;
import eu.europa.ec.fisheries.schema.exchange.common.v1.ReportType;
import eu.europa.ec.fisheries.schema.exchange.common.v1.ReportTypeType;
import eu.europa.ec.fisheries.schema.exchange.movement.v1.SendMovementToPluginType;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.ExchangePluginMethod;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.PingRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.SetCommandRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.SetConfigRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.SetMdrPluginRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.SetReportRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.StartRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.StopRequest;
import eu.europa.ec.fisheries.schema.exchange.service.v1.SettingListType;
import eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException;
import eu.europa.ec.fisheries.schema.exchange.plugin.v1.SetFLUXFAResponseRequest;

/**
 **/
public class ExchangePluginRequestMapper {

    public static String createSetReportRequest(XMLGregorianCalendar dateReceived, SendMovementToPluginType movement, String unsentMessageGuid) throws ExchangeModelMarshallException {
        SetReportRequest request = new SetReportRequest();
        request.setMethod(ExchangePluginMethod.SET_REPORT);
        ReportType reportType = new ReportType();
        reportType.setRecipient(movement.getRecipient());
        reportType.getRecipientInfo().addAll(movement.getRecipientInfo());
        reportType.setMovement(movement.getMovement());
        reportType.setTimestamp(dateReceived);
        reportType.setType(ReportTypeType.MOVEMENT);
        reportType.setUnsentMessageGuid(unsentMessageGuid);
        request.setReport(reportType);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createSetCommandRequest(CommandType commandType) throws ExchangeModelMarshallException {
        SetCommandRequest request = new SetCommandRequest();
        request.setMethod(ExchangePluginMethod.SET_COMMAND);
        request.setCommand(commandType);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createSetConfigRequest(SettingListType settingList) throws ExchangeModelMarshallException {
        SetConfigRequest request = new SetConfigRequest();
        request.setMethod(ExchangePluginMethod.SET_CONFIG);
        request.setConfigurations(settingList);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createPingRequest() throws ExchangeModelMarshallException {
        PingRequest request = new PingRequest();
        request.setMethod(ExchangePluginMethod.PING);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createStartRequest() throws ExchangeModelMarshallException {
        StartRequest request = new StartRequest();
        request.setMethod(ExchangePluginMethod.START);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createStopRequest() throws ExchangeModelMarshallException {
        StopRequest request = new StopRequest();
        request.setMethod(ExchangePluginMethod.STOP);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }
    
	/**
	 * Maps the MDR Request that has to be sent to the MDR plugin to string. 
	 * 
	 * @param mdrBaseRequest
	 * @return
	 * @throws ExchangeModelMarshallException
	 */
	public static String mapMdrRequestToPluginBaseRequest(String mdrBaseRequest) throws ExchangeModelMarshallException{
		SetMdrPluginRequest pluginRequest = new SetMdrPluginRequest();
		pluginRequest.setMethod(ExchangePluginMethod.SET_MDR_REQUEST);
		pluginRequest.setRequest(mdrBaseRequest);
		return JAXBMarshaller.marshallJaxBObjectToString(pluginRequest);
	}


    public static String createSetFLUXFAResponseRequest(String  fluxFAResponse) throws ExchangeModelMarshallException {
        SetFLUXFAResponseRequest request = new SetFLUXFAResponseRequest();
        request.setMethod(ExchangePluginMethod.SET_FLUX_RESPONSE);
        request.setResponse(fluxFAResponse);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

}