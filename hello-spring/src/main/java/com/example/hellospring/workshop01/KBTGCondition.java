package com.example.hellospring.workshop01;

public class KBTGCondition implements MyCondition {
    @Override
    public boolean check(int number) {
        return number%7 == 0;
    }

    @Override
    public String print() {
        return "KBTG BASIC JAVA";
    }
}
