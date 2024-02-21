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
public class Employee {

    @MongoId
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    private Set<String> addresses;
    private Set<Client> clients;
    private Manager manager;

}
