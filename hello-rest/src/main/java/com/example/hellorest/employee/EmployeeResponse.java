package com.example.hellorest.employee;

public class EmployeeResponse{
    private int id;
    private String fname;
    private String lname;

    public EmployeeResponse() {
    }

    public EmployeeResponse(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getFname(){
        return fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public String getLname(){
        return lname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
