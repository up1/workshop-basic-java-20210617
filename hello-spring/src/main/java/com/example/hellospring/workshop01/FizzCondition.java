package com.example.hellospring.workshop01;

public class FizzCondition implements MyCondition {
    public boolean check(int number) {
        return number % 3 == 0;
    }

    public String print() {
        return "Fizz";
    }
}
