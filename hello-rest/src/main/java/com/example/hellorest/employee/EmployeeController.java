package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@RestController
public class EmployeeController {

    public EmployeeResponse getEmployeeByID(int id) {
        return new EmployeeResponse(id, "Somkiat", "Pui");
    }

}
