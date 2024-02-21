package com.tcsemp.repository;

import com.tcsemp.entities.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
