package za.co.tman.logging.service.messaging;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import za.co.tman.logging.enums.EventType;
import za.co.tman.logging.enums.IncidentPriority;
import za.co.tman.logging.enums.PubSubMessageType;


public class InterModulePubSubMessage {
    
    /**
     * Headers as received from the MessageHandler.
     */
    private Map<String, String> messageHeaders = new HashMap<>();
    
    public Map<String, String> getMessageHeaders() {
        return messageHeaders;
    }
    
    public void setMessageHeaders(Map<String, String> messageHeaders) {
        this.messageHeaders = messageHeaders;
    }
    
    /**
     * Payload variable for payloads for String value only.
     */
    private String payload;
    
    public String getPayload() {
        return payload;
    }
    
    public void setPayload(String payload) {
        this.payload = payload;
    }
    
    private String messageId;
    
    public String getMessageId() {
        return messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * Determine the Inter module message type.
     */
    private PubSubMessageType pubSubMessageType;
    
    /**
     * This will be populated if it is an update message on an existing Incident logged.
     */
    private Long incidentNumber;
    
    /**
     * The timestamp of when the message was created.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC")
    private Instant messageDateCreated;
    
    /**
     * This will be used for the short description of the incident.
     */
    private String incidentHeader;
    
    /**
     * This will be used for the free-format description field of what happended in detail.
     */
    private String incidentDescription;
    
    /**
     * This will indicate what type of incident message this is.
     */
    private EventType eventType;
    
    /**
     * This will indicate the priority of the incident
     */
    private IncidentPriority incidentPriority;
    
    /**
     * This will be used to log the operator/originator of the message
     */
    private String operatorName;
    
    /**
     * This will be used to set the originating module name which generated the message.
     */
    private String originatingApplicationModuleName;
    
    public PubSubMessageType getPubSubMessageType() {
        return pubSubMessageType;
    }
    
    public void setPubSubMessageType(PubSubMessageType pubSubMessageType) {
        this.pubSubMessageType = pubSubMessageType;
    }
    
    public Long getIncidentNumber() {
        return incidentNumber;
    }
    
    public void setIncidentNumber(Long incidentNumber) {
        this.incidentNumber = incidentNumber;
    }
    
    public Instant getMessageDateCreated() {
        return messageDateCreated;
    }
    
    public void setMessageDateCreated(Instant messageDateCreated) {
        this.messageDateCreated = messageDateCreated;
    }
    
    public String getIncidentHeader() {
        return incidentHeader;
    }
    
    public void setIncidentHeader(String incidentHeader) {
        this.incidentHeader = incidentHeader;
    }
    
    public String getIncidentDescription() {
        return incidentDescription;
    }
    
    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }
    
    public EventType getEventType() {
        return eventType;
    }
    
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    
    public IncidentPriority getIncidentPriority() {
        return incidentPriority;
    }
    
    public void setIncidentPriority(IncidentPriority incidentPriority) {
        this.incidentPriority = incidentPriority;
    }
    
    public String getOperatorName() {
        return operatorName;
    }
    
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
    
    public String getOriginatingApplicationModuleName() {
        return originatingApplicationModuleName;
    }
    
    public void setOriginatingApplicationModuleName(String originatingApplicationModuleName) {
        this.originatingApplicationModuleName = originatingApplicationModuleName;
    }

}
