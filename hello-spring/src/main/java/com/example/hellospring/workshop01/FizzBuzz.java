package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String printFizzBuzz(int number) {
        // Prepare all conditions
        MyCondition[] conditions = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new KBTGCondition()
        };
        // Check condition ?
        for (MyCondition condition : conditions) {
            if(condition.check(number)) {
                return condition.print();
            }
        }

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
