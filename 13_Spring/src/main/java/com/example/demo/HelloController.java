package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Hello;

// src/main/java/com/example/demo/HelloController.java
@Controller
public class HelloController {

    @GetMapping("/hello")
    // @ResponseBody    // 文字列を直接表示したい場合に使用する
    public String hello(Model model) {
        Hello hello = new Hello("Hello, World!");

        model.addAttribute("hello", hello);

        // 使うViewの名前を返す（src/main/resources/templates/hello.html）
        return "hello";
    }
}

