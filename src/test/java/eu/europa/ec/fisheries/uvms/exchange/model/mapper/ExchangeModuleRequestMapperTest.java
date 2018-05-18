package eu.europa.ec.fisheries.uvms.exchange.model.mapper;

import static org.junit.Assert.assertEquals;

import eu.europa.ec.fisheries.schema.exchange.v1.ExchangeLogStatusTypeType;
import org.junit.Test;

public class ExchangeModuleRequestMapperTest {

    @Test
    public void createUpdateLogStatusRequest() throws Exception {
        String logGuid = "abc";
        ExchangeLogStatusTypeType newStatus = ExchangeLogStatusTypeType.SUCCESSFUL;

        String result = ExchangeModuleRequestMapper.createUpdateLogStatusRequest(logGuid, newStatus);
        assertEquals("<ns2:UpdateLogStatusRequest xmlns:ns2=\"urn:module.exchange.schema.fisheries.ec.europa.eu:v1\">\n" + "    <method>UPDATE_LOG_STATUS</method>\n" + "    <logGuid>abc</logGuid>\n" + "    <newStatus>SUCCESSFUL</newStatus>\n" + "    <duplicate>false</duplicate>\n" + "</ns2:UpdateLogStatusRequest>", result);
    }

}