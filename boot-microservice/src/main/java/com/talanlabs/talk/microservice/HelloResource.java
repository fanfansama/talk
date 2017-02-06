package com.talanlabs.talk.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @Value(value = "${spring.application.name}")
    private String myName;

    @GetMapping(value = "/")
    public String hello(){
        return "Hello, I'm '" + myName +"' !";
    }
}
