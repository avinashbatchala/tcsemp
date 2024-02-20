package com.tcsemp.services;

import com.tcsemp.entities.Employee;

public interface ValidatorService {
    boolean validateEmail(String email);
    boolean validatePhone(String phone);
    boolean validateAddress(String address);
    boolean validateName(String name);
    boolean validateEmployee(Employee employee);
}
