package com.example.SpringCore.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.example.SpringCore.controller.GreetingController;

@Service
public class GreetingService {
    // Create a Logger Instance to log custom messages
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

        public String getGreetings(){
            logger.info("Service Layer Invoked Here");

            return "Hello Ankit Rajput";
        }
}