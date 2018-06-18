package za.co.tman.logging.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import za.co.tman.logging.domain.GenericMessagesReceived;


/**
 * Spring Data MongoDB repository for the GenericMessagesReceived entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GenericMessagesReceivedRepository extends MongoRepository<GenericMessagesReceived, String> {

}
