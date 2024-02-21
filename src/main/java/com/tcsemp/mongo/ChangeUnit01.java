package com.tcsemp.mongo;

import io.mongock.api.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@ChangeUnit(id = "changeUnit01", order = "001", author = "ab")
@Slf4j
@Component
public class ChangeUnit01 {

    private final MongoTemplate mongoTemplate;

    public ChangeUnit01(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @BeforeExecution
    public void beforeExecution() {
        System.out.println("Before execution");
    }

    @RollbackBeforeExecution
    public void rollbackBeforeExecution() {
        System.out.println("Rollback before execution");
    }

    @Execution
    public void execution() {
       if(!mongoTemplate.collectionExists("tcsemp")) {
           mongoTemplate.createCollection("tcsemp");
           log.info("tcsemp collection created");
       }
       log.info("tcsemp collection already exists");
    }

    @RollbackExecution
    public void rollbackExecution() {

    }
}
