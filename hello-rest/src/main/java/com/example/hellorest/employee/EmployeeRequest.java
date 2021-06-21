package com.example.hellorest.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest{
    @JsonProperty("first_name")
    private String fname;

    private String lname;

    public EmployeeRequest() {
    }

    public EmployeeRequest(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }
}
