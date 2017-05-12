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

import eu.europa.ec.fisheries.schema.exchange.module.v1.ExchangeModuleMethod;
import eu.europa.ec.fisheries.schema.exchange.module.v1.ReceiveSalesQueryRequest;
import eu.europa.ec.fisheries.schema.exchange.module.v1.ReceiveSalesReportRequest;
import eu.europa.ec.fisheries.schema.exchange.module.v1.ReceiveSalesResponseRequest;
import eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.PluginType;
import eu.europa.ec.fisheries.schema.exchange.registry.v1.ExchangeRegistryMethod;
import eu.europa.ec.fisheries.schema.exchange.registry.v1.RegisterServiceRequest;
import eu.europa.ec.fisheries.schema.exchange.registry.v1.UnregisterServiceRequest;
import eu.europa.ec.fisheries.schema.exchange.service.v1.CapabilityListType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.ServiceType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.SettingListType;
import eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ExchangeModuleRequestMapper {

    final static Logger LOG = LoggerFactory.getLogger(ExchangeModuleRequestMapper.class);

    public static String createRegisterServiceRequest(ServiceType serviceType, CapabilityListType capabilityList, SettingListType settingList) throws ExchangeModelMarshallException {
        RegisterServiceRequest request = new RegisterServiceRequest();
        request.setMethod(ExchangeRegistryMethod.REGISTER_SERVICE);
        request.setService(serviceType);
        request.setCapabilityList(capabilityList);
        request.setSettingList(settingList);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createUnregisterServiceRequest(ServiceType serviceType) throws ExchangeModelMarshallException {
        UnregisterServiceRequest request = new UnregisterServiceRequest();
        request.setMethod(ExchangeRegistryMethod.UNREGISTER_SERVICE);
        request.setService(serviceType);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createReceiveSalesReportRequest(String report, String reportGuid, String sender, String username, PluginType typeOfOriginatingPlugin, Date dateReceived) throws ExchangeModelMarshallException {
        ReceiveSalesReportRequest request = new ReceiveSalesReportRequest();
        request.setMethod(ExchangeModuleMethod.RECEIVE_SALES_REPORT);
        request.setUsername(username);
        request.setReport(report);
        request.setPluginType(typeOfOriginatingPlugin);
        request.setSenderOrReceiver(sender);
        request.setMessageGuid(reportGuid);
        request.setDate(dateReceived);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }
    public static String createReceiveSalesResponseRequest(String response, String username, PluginType typeOfOriginatingPlugin) throws ExchangeModelMarshallException {
        ReceiveSalesResponseRequest request = new ReceiveSalesResponseRequest();
        request.setMethod(ExchangeModuleMethod.RECEIVE_SALES_RESPONSE);
        request.setUsername(username);
        request.setResponse(response);
        request.setPluginType(typeOfOriginatingPlugin);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String createReceiveSalesQueryRequest(String query, String username, PluginType typeOfOriginatingPlugin) throws ExchangeModelMarshallException {
        ReceiveSalesQueryRequest request = new ReceiveSalesQueryRequest();
        request.setMethod(ExchangeModuleMethod.RECEIVE_SALES_QUERY);
        request.setUsername(username);
        request.setQuery(query);
        request.setPluginType(typeOfOriginatingPlugin);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

}