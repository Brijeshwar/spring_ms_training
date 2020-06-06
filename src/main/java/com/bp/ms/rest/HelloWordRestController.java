package com.bp.ms.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello word spring boot application.";
    }
}
