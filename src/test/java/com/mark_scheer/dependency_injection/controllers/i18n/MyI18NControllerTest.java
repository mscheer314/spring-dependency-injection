package com.mark_scheer.dependency_injection.controllers.i18n;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyI18NControllerTest {

    @Autowired
    MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(myI18NController.sayHello());
    }
}
