package com.mark_scheer.dependency_injection.controllers;

import com.mark_scheer.dependency_injection.services.GreetingService;
import com.mark_scheer.dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
