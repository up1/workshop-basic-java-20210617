package com.example.hellospring;

import java.util.List;

public class DemoOOP {

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        System.out.println(employee.toString());

        if( employee instanceof Object) {
            System.out.println("OK");
        }

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println("\u001B[34m" + "employee 1 : " + employee1);
        System.out.println("\u001B[34m" + "employee 2 : " + employee2);

        if(employee1.equals(employee2)) {
            System.out.println("\u001B[32m" + "Equal");
        } else {
            System.out.println("\u001B[31m" + "Not Equal");
        }



    }

}

