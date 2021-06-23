package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private Random random;

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void callApiWithPathVariableAndDatabase() {
        // Mock/Stub/Spyß
        when(random.nextInt(anyInt())).thenReturn(5);

        // Create data in database
        repository.save(new Employee(123, "Somkiat", "Pui"));

        // Testing
        EmployeeResponse expected
                = new EmployeeResponse(123, "Somkiat5", "Pui");

        // Call API
        EmployeeResponse response
                = restTemplate.getForObject("/employee/123", EmployeeResponse.class);

        assertEquals(123, response.getId());
        assertEquals("Somkiat5", response.getFname());
        assertEquals("Pui", response.getLname());
        assertEquals(expected, response); // Pass ?
    }

    @Test
    public void callApiWithREquestParameter() {
        EmployeeResponse response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Somkiat", response.getFname());
        assertEquals("Pui", response.getLname());
    }

}