package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random7 implements IRandom {

    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class GenerateUUIDTest {

    @Test
    public void getUUID() {
        GenerateUUID generateUUID = new GenerateUUID();
        generateUUID.setRandom(new Random7()); // Dependency Injection (DI)
        String uuid = generateUUID.get("somkiat");
        assertEquals("XYZsomkiat7", uuid);
    }

}