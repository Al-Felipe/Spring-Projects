package com.example.activity.controller;

import com.example.activity.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Service service = new Service();

    @GetMapping("/activity")
    public String getActivity(){
        return service.getActivity();
    }
}
