package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// src/main/java/com/example/demo/DemoController.java
@Controller
public class DemoController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
