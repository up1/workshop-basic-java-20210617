package com.example.hellorest.employee;

public class EmployeeRequest{
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
