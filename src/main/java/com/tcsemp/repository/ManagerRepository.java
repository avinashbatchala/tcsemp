package com.tcsemp.repository;

import com.tcsemp.entities.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagerRepository extends MongoRepository<Manager, String> {


}
