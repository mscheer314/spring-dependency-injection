package com.mark_scheer.dependency_injection.controllers;

import com.mark_scheer.dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}
