package com.tcsemp.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Set;

@Document
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Manager {

    @MongoId
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    private Set<Employee> employees;
}
