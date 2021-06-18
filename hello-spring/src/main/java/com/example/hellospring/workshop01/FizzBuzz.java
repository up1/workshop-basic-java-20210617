package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String printFizzBuzz(int number) {
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        if (fizzBuzzCondition.check(number)) {
            return fizzBuzzCondition.print();
        }
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}

/**
 * Condition 1 :: 3 ,5 => FizzBuzz
 * Condition 2 :: 3 => Fizz
 * Condition 3 :: 5 => Buzz
 * Condition 4 :: Same number
 * Condition 5 :: 7 => KBTG BASIC JAVA
 */
