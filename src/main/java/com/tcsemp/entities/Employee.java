package com.tcsemp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @Id
    private long id;

    private String firstName;;
    private String lastName;
    private String email;
    private String phone;
    private String address;

}
