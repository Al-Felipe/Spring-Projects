package com.example.RestAPI.controller;

import com.example.RestAPI.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service = new Service();

    // conexão endpoint
    @GetMapping("/test")
    public String HelloWorld(){
        return service.welcomeMessage();
    }

    @GetMapping("/exemplo")
    public String helloWorld(){
        return service.exampleMessage();
    }

}
