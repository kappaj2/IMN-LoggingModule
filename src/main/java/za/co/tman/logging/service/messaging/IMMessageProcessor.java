package za.co.tman.logging.service.messaging;

import org.springframework.messaging.Message;


public interface IMMessageProcessor {
    
    void processMessageReceived(Message<?> message);

}
