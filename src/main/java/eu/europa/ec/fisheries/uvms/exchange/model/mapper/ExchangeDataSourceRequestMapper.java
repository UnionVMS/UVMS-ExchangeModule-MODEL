package eu.europa.ec.fisheries.uvms.exchange.model.mapper;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.PluginType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.CapabilityListType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.ServiceType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.SettingListType;
import eu.europa.ec.fisheries.schema.exchange.service.v1.StatusType;
import eu.europa.ec.fisheries.schema.exchange.source.v1.CreateLogRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.CreateUnsentMessageRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.ExchangeDataSourceMethod;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetLogListByQueryRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetLogStatusHistoryRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetServiceCapabilitiesRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetServiceListRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetServiceRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetServiceSettingsRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.GetUnsentMessageListRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.RegisterServiceRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.ResendMessageRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.SetServiceSettingsRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.SetServiceStatusRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.UnregisterServiceRequest;
import eu.europa.ec.fisheries.schema.exchange.source.v1.UpdateLogStatusRequest;
import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeListQuery;
import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusType;
import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType;
import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogType;
import eu.europa.ec.fisheries.schema.exchange.v1.UnsentMessageType;
import eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMapperException;
import eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException;

public class ExchangeDataSourceRequestMapper {

    final static Logger LOG = LoggerFactory.getLogger(ExchangeDataSourceRequestMapper.class);

    public static String mapCreateExchangeLogToString(ExchangeLogType log) throws ExchangeModelMapperException {
        try {
            CreateLogRequest request = new CreateLogRequest();
            request.setMethod(ExchangeDataSourceMethod.CREATE_LOG);
            request.setExchangeLog(log);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping GetServiceListRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping GetServiceListRequest to String ]");
        }
    }

    public static String mapGetExchageLogListByQueryToString(ExchangeListQuery query) throws ExchangeModelMapperException {
        try {
            GetLogListByQueryRequest request = new GetLogListByQueryRequest();
            request.setMethod(ExchangeDataSourceMethod.GET_LOG_BY_QUERY);
            request.setQuery(query);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping GetServiceListRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping GetServiceListRequest to String ]");
        }
    }

    public static String mapGetServiceListToString(List<PluginType> pluginTypes) throws ExchangeModelMarshallException {
        GetServiceListRequest request = new GetServiceListRequest();
        request.setMethod(ExchangeDataSourceMethod.LIST_SERVICES);
        if (pluginTypes != null) {
            request.getType().addAll(pluginTypes);
        }
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapGetServiceToString(String serviceId) throws ExchangeModelMapperException {
        try {
            GetServiceRequest request = new GetServiceRequest();
            request.setMethod(ExchangeDataSourceMethod.GET_SERVICE);
            request.setServiceId(serviceId);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping GetServiceListRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping GetServiceListRequest to String ]");
        }
    }

    public static String mapRegisterServiceToString(ServiceType service, CapabilityListType capabilityList, SettingListType settingList) throws ExchangeModelMapperException {
        try {
            RegisterServiceRequest request = new RegisterServiceRequest();
            request.setMethod(ExchangeDataSourceMethod.REGISTER_SERVICE);

            if (service == null) {
                throw new ExchangeModelMapperException("ServiceType cannot be null in RegisterServiceRequest!");
            } else {

                if (service.getServiceResponseMessageName() == null || service.getServiceResponseMessageName().isEmpty()) {
                    throw new ExchangeModelMapperException("Service response message name in ServiceType cannot be null or empty!");
                }

                if (service.getServiceClassName() == null || service.getServiceResponseMessageName().isEmpty()) {
                    throw new ExchangeModelMapperException("Service classname ServiceType cannot be null or empty!");
                }

            }

            request.setService(service);
            request.setCapabilityList(capabilityList);
            request.setSettingList(settingList);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping RegisterServiceRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping RegisterServiceRequest to String ]");
        }
    }

    public static String mapUnregisterServiceToString(ServiceType service) throws ExchangeModelMapperException {
        try {
            UnregisterServiceRequest request = new UnregisterServiceRequest();
            request.setService(service);
            request.setMethod(ExchangeDataSourceMethod.UNREGISTER_SERVICE);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping RegisterServiceRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping RegisterServiceRequest to String ]");
        }
    }

    public static String mapGetServiceSettingsToString(String serviceClassName) throws ExchangeModelMapperException {
        try {
            GetServiceSettingsRequest request = new GetServiceSettingsRequest();
            request.setServiceName(serviceClassName);
            request.setMethod(ExchangeDataSourceMethod.GET_SETTINGS);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping GetServiceSettingsRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping GetServiceSettingsRequest to String ]");
        }
    }

    public static String mapGetServiceCapabilitiesToString(String serviceClassName) throws ExchangeModelMapperException {
        try {
            GetServiceCapabilitiesRequest request = new GetServiceCapabilitiesRequest();
            request.setServiceName(serviceClassName);
            request.setMethod(ExchangeDataSourceMethod.GET_CAPABILITIES);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (Exception e) {
            LOG.error("[ Error when mapping GetServiceCapabilitiesRequest to String ] {}", e.getMessage());
            throw new ExchangeModelMapperException("[ Error when mapping GetServiceCapabilitiesRequest to String ]");
        }
    }

    public static String mapSetSettingsToString(String serviceClassName, SettingListType settingListType) throws ExchangeModelMapperException {
        try {
            SetServiceSettingsRequest request = new SetServiceSettingsRequest();
            request.setMethod(ExchangeDataSourceMethod.SET_SETTINGS);
            request.setServiceName(serviceClassName);
            request.setSettings(settingListType);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (ExchangeModelMarshallException e) {
            LOG.error("[ Error when mapping SetServiceSettingsRequest ] ");
            throw new ExchangeModelMapperException("[ Error when mapping SetServiceSettingsRequest ]");
        }
    }

    public static String mapSetServiceStatus(String serviceClassName, StatusType status) throws ExchangeModelMapperException {
        try {
            SetServiceStatusRequest request = new SetServiceStatusRequest();
            request.setMethod(ExchangeDataSourceMethod.SET_SERVICE_STATUS);
            request.setServiceName(serviceClassName);
            request.setStatus(status);
            return JAXBMarshaller.marshallJaxBObjectToString(request);
        } catch (ExchangeModelMarshallException e) {
            LOG.error("[ Error when mapping SetServiceStatusRequest ]");
            throw new ExchangeModelMapperException("[ Error when mapping SetServiceStatusRequest ]");
        }
    }

	public static String mapGetLogStatusHistoryRequest(String guid) throws ExchangeModelMarshallException {
		GetLogStatusHistoryRequest request = new GetLogStatusHistoryRequest();
		request.setMethod(ExchangeDataSourceMethod.GET_LOG_STATUS_HISTORY);
		request.setLogGuid(guid);
		return JAXBMarshaller.marshallJaxBObjectToString(request);
	}

	public static String mapUpdateLogStatusRequest(String guid, ExchangeLogStatusTypeType type) throws ExchangeModelMarshallException {
		UpdateLogStatusRequest request = new UpdateLogStatusRequest();
		request.setMethod(ExchangeDataSourceMethod.UPDATE_LOG_STATUS);
		ExchangeLogStatusType status = new ExchangeLogStatusType();
		status.setLogGuid(guid);
		status.setStatus(type);
		request.setStatus(status);
		return JAXBMarshaller.marshallJaxBObjectToString(request);
	}

	public static String mapGetSendingQueue() throws ExchangeModelMarshallException {
		GetUnsentMessageListRequest request = new GetUnsentMessageListRequest();
		request.setMethod(ExchangeDataSourceMethod.GET_UNSENT_MESSAGE_LIST);
		return JAXBMarshaller.marshallJaxBObjectToString(request);
	}

	public static String mapResendMessage(List<String> messageIdList) throws ExchangeModelMarshallException {
		ResendMessageRequest request = new ResendMessageRequest();
		request.setMethod(ExchangeDataSourceMethod.RESEND_UNSENT_MESSAGE);
		request.getUnsentMessageId().addAll(messageIdList);
		return JAXBMarshaller.marshallJaxBObjectToString(request);
	}

	public static String mapCreateUnsentMessage(XMLGregorianCalendar dateReceived, String senderReceiver, String recipient, String messageText) throws ExchangeModelMarshallException {
		CreateUnsentMessageRequest request = new CreateUnsentMessageRequest();
		request.setMethod(ExchangeDataSourceMethod.CREATE_UNSENT_MESSAGE);
		UnsentMessageType unsentMessage = new UnsentMessageType();
		unsentMessage.setDateReceived(dateReceived);
		unsentMessage.setSenderReceiver(senderReceiver);
		unsentMessage.setRecipient(recipient);
		unsentMessage.setMessage(messageText);
		request.setMessage(unsentMessage);
		return JAXBMarshaller.marshallJaxBObjectToString(request);
	}

}
