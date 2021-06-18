package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {

    public String get(String name) {
        String id = "";
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        id = "XYZ" + name + randomNumber;
        return id;
    }

}
