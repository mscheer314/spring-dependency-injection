package com.mark_scheer.dependency_injection.controllers;

import com.mark_scheer.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerInjectedController {
    private final GreetingService greetingService;

    public ControllerInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
