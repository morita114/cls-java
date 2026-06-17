package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.demo.Hello;

@Service
public class HelloService {
    // Spring Boot起動時にこのクラスをインスタンス化して管理する
    private final Hello hello = new Hello("Hello, World!");

    public Hello getHello() {
        return hello;   // ↑のhelloインスタンスを返す
    }
}