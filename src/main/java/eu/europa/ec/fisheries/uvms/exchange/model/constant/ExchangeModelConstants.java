package eu.europa.ec.fisheries.uvms.exchange.model.constant;

public class ExchangeModelConstants {

    public static final String CONNECTION_FACTORY = "java:/ConnectionFactory";
    public static final String CONNECTION_TYPE = "javax.jms.MessageListener";
    public static final String PLUGIN_EVENTBUS = "java:/jms/topic/EventBus";
    public static final String EVENTBUS_NAME = "EventBus";

    public static final String DESTINATION_TYPE_QUEUE = "javax.jms.Queue";
    public static final String DESTINATION_TYPE_TOPIC = "javax.jms.Topic";

    public static final String EXCHANGE_QUEUE            = "java:/jms/queue/UVMSExchange";
    public static final String EXCHANGE_EVENT_QUEUE      = "java:/jms/queue/UVMSExchangeEvent";
    public static final String EXCHANGE_EVENT_QUEUE_NAME = "UVMSExchangeEvent";
    public static final String QUEUE_DATASOURCE_INTERNAL = "java:/jms/queue/UVMSExchangeModel";

    public static final String EXCHANGE_REGISTER_SERVICE = "EXCHANGE_REGISTRY";
    public static final String SERVICE_NAME = "ServiceName";

    public static final String MODULE_NAME = "exchange";

    public static final String RULES_EVENT_QUEUE = "java:/jms/queue/UVMSRulesEvent";
    public static final String ASSET_EVENT_QUEUE = "java:/jms/queue/UVMSAssetEvent";
    public static final String QUEUE_INTEGRATION_AUDIT = "java:/jms/queue/UVMSAuditEvent";

    // For ack
    public static final String MOVEMENT_EVENT_QUEUE = "java:/jms/queue/UVMSMovement";
	public static final String ACTIVITY_EVENT_QUEUE = "java:/jms/queue/UVMSActivityEvent";

    public static final String MDR_EVENT_QUEUE = "java:/jms/queue/UVMSMdrEvent";

}
