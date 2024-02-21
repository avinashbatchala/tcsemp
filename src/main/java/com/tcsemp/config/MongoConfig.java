package com.tcsemp.config;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.tcsemp.repository")
@EnableMongock
public class MongoConfig {
}
