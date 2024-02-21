package com.tcsemp.services.impl;

import com.tcsemp.entities.Employee;
import com.tcsemp.services.ValidatorService;
import org.springframework.stereotype.Service;

@Service
public class ValidatorServiceImpl implements ValidatorService {

    @Override
    public boolean validateEmail(String email) {
        return email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])\n");
    }

    @Override
    public boolean validatePhone(String phone) {
        return phone.matches("^(\\d{10})$");
    }

    @Override
    public boolean validateAddress(String address) {
        return address.matches("^(\\d+)\\s(.+)$");
    }

    @Override
    public boolean validateName(String name) {
        return name.matches("^(.+)\\s(.+)$");
    }

    public boolean validateEmployee(Employee employee) {
        //Write a method to validate the employee object and return which field went wrong
        return validateEmail(employee.getEmail()) &&
                validatePhone(employee.getPhone()) &&
              //  validateAddress(employee.getAddress()) &&
                validateName(employee.getFirstName()) &&
                validateName(employee.getLastName());
    }
}
