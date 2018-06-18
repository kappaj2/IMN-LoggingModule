package za.co.tman.logging.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import za.co.tman.logging.domain.GenericMessagesReceived;
import za.co.tman.logging.repository.GenericMessagesReceivedRepository;


/**
 * Service Implementation for managing GenericMessagesReceived.
 */
@Service
public class GenericMessagesReceivedService {
    
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    private final GenericMessagesReceivedRepository genericMessagesReceivedRepository;
    
    public GenericMessagesReceivedService(GenericMessagesReceivedRepository genericMessagesReceivedRepository) {
        this.genericMessagesReceivedRepository = genericMessagesReceivedRepository;
    }
    
    /**
     * Get all the genericMessagesReceiveds.
     *
     * @return the list of entities
     */
    public List<GenericMessagesReceived> findAll() {
        log.debug("Request to get all GenericMessagesReceiveds");
        return genericMessagesReceivedRepository.findAll();
    }
    
    /**
     * Get one genericMessagesReceived by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    public GenericMessagesReceived findOne(String id) {
        log.debug("Request to get GenericMessagesReceived : {}", id);
        return null;// genericMessagesReceivedRepository.findOne(id);
    }
    
    /**
     * Delete the genericMessagesReceived by id.
     *
     * @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete GenericMessagesReceived : {}", id);
        //genericMessagesReceivedRepository.delete(id);
    }
    
}
