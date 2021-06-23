package com.example.hellorest.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeErrorHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<EmployeeResponse> todo(EmployeeNotFoundException e) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        return new ResponseEntity<>(employeeResponse, HttpStatus.NOT_FOUND);
    }

}
