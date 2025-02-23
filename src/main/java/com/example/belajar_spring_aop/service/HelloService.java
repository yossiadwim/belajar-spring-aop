package com.example.belajar_spring_aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService{

    public String hello(String firstname, String lastname) {
        log.info("Call HelloService.hello()");
        return "Hello " + firstname + " " + lastname;
    }


    public String bye(String name) {
        log.info("Call HelloService.bye()");
        return "Bye " + name;
    }

    public void test(){
        log.info("Call HelloService.test()");
    }
}
