package com.tcsemp.controllers;

import com.tcsemp.entities.Employee;
import com.tcsemp.services.EmployeeService;
import com.tcsemp.services.ValidatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final ValidatorService validatorService;

    public EmployeeController(EmployeeService employeeService, ValidatorService validatorService) {
        this.employeeService = employeeService;
        this.validatorService = validatorService;
    }


    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

        if(validatorService.validateEmployee(employee)) {
            return ResponseEntity.ok(employeeService.createEmployee(employee));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
