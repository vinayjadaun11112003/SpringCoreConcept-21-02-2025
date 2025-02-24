package com.example.SpringCore.controller;
import com.example.SpringCore.service.GreetingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    // Create a Logger Instance to log custom messages
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    GreetingService greetingService;
    @GetMapping
    public String getGreeting() {

        logger.info("Controller Layer Invoked Here");

        return greetingService.getGreetings();
    }

    @GetMapping("/{name}")
    public String getPersonalizedGreeting(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot!";
    }
}