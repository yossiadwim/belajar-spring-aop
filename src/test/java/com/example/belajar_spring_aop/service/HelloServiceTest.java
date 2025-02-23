package com.example.belajar_spring_aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Yossia Mahardika", helloService.hello("Yossia", "Mahardika"));
        Assertions.assertEquals("Bye Yossia", helloService.bye("Yossia"));
        helloService.test();
    }
}
