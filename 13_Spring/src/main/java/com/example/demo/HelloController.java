package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Hello;
import com.example.demo.HelloService;

// src/main/java/com/example/demo/HelloController.java
@Controller
public class HelloController {

    @GetMapping("/hello0")
    // @ResponseBody    // 文字列を直接表示したい場合に使用する
    public String hello0(Model model) {
        Hello hello = new Hello("Hello, World! by HelloController.hello0()");

        model.addAttribute("hello", hello);
        // 使うViewの名前を返す（src/main/resources/templates/hello.html）
        return "hello";
    }

    // @Autowired
    // private HelloService helloService;
    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping("/hello1")
    public String hello1(Model model) {
        Hello hello = helloService.getHello();
        // これ以降はhello0と同じ
        model.addAttribute("hello", hello);
        return "hello";
    }
}

