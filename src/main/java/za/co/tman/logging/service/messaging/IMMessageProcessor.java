package za.co.tman.logging.service.messaging;

public interface IMMessageProcessor {
    
    void processMessageReceived(InterModulePubSubMessage interModulePubSubMessage);

}
