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

import eu.europa.ec.fisheries.uvms.commons.xml.AbstractJAXBMarshaller;
import eu.europa.ec.fisheries.uvms.commons.xml.JAXBRuntimeException;
import eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException;
import org.apache.commons.lang3.StringUtils;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;

public class JAXBMarshaller extends AbstractJAXBMarshaller {

    /**
     * Marshalls a JAXB Object to a XML String representation
     *
     * @param <T>
     * @param data
     * @return
     * @throws eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException
     */
    public static <T> String marshallJaxBObjectToString(T data) throws ExchangeModelMarshallException {
        try {
            Map<String,Object> properties = new HashMap<>();
            properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            properties.put(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            return marshallToString(data, properties);
        } catch (JAXBException | JAXBRuntimeException ex) {
            throw new ExchangeModelMarshallException("Error when marshalling Object to String", ex);
        }
    }

    public static <T> String marshallJaxBObjectToString(T data, String encoding, boolean formatted) throws JAXBException, JAXBRuntimeException {
        Map<String,Object> properties = new HashMap<>();
        properties.put(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        if (StringUtils.isNotEmpty(encoding)) {
            properties.put(Marshaller.JAXB_ENCODING,encoding);
        }
        if (formatted) {
            properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        }
        return marshallToString(data, properties);
    }

    /**
     * Unmarshalls A textMessage to the desired Object. The object must be the
     * root object of the unmarchalled message!
     *
     * @param <R>
     * @param textMessage
     * @param clazz       pperException
     * @return
     * @throws eu.europa.ec.fisheries.uvms.exchange.model.exception.ExchangeModelMarshallException
     */
    public static <R> R unmarshallTextMessage(TextMessage textMessage, Class<R> clazz) throws ExchangeModelMarshallException {
        try {
            return unmarshallString(textMessage.getText(), clazz);
        } catch (JMSException ex) {
            throw new ExchangeModelMarshallException("Error when unmarshalling response in ResponseMapper", ex);
        }
    }

    /**
     * Unmarshalls a string to the desired class.
     *
     * @param text
     * @param clazz class to marshall to. The class must be the
     *              root object of the unmarchalled message!
     * @return
     * @throws ExchangeModelMarshallException
     */
    public static <R> R unmarshallString(String text, Class<R> clazz) throws ExchangeModelMarshallException {
        try {
            return unmarshallTo(text, clazz);
        } catch (JAXBException | JAXBRuntimeException ex) {
            throw new ExchangeModelMarshallException("Error when unmarshalling text", ex);
        }
    }
}
