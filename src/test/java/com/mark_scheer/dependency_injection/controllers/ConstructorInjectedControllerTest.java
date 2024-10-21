package com.mark_scheer.dependency_injection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConstructorInjectedControllerTest {

    @Autowired
    ControllerInjectedController controllerInjectedController;

    @Test
    void sayHello() {
        System.out.println(controllerInjectedController.sayHello());
    }
}
