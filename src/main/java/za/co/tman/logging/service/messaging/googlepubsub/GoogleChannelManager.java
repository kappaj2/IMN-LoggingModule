package za.co.tman.logging.service.messaging.googlepubsub;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import za.co.tman.logging.service.messaging.dto.InterModulePubSubMessage;


public interface GoogleChannelManager {
    
    void pubSubMessageSender(InterModulePubSubMessage interModulePubSubMessage);
    
    MessageChannel pubsubInputChannel();
    
    MessageHandler messageReceiver();
    
}
