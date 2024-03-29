package com.example.ejercicios456.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${message.hola.mundo}")
    String holaMundoMessage;
    @GetMapping
    public String saludar() {
        return holaMundoMessage;
    }
}
