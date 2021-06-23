package com.example.hellorest.user;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public List<UserModel> getAllUsers() {
        UserModel[] results = restTemplate
                .getForObject("https://jsonplaceholder.typicode.com/users", UserModel[].class);
        return Arrays.asList(results);
    }

    public UserModel getUserById(int id) {
        // TODO
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        UserModel user = restTemplate.getForObject(url, UserModel.class);
        return user;
    }

}
