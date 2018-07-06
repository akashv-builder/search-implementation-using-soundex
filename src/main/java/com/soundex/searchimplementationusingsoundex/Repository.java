package com.soundex.searchimplementationusingsoundex;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Items, String> {

}