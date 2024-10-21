package com.mark_scheer.dependency_injection.controllers.i18n;

import com.mark_scheer.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

