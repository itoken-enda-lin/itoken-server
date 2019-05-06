package com.enda.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("sayHello")
    public String say() {
        return String.format("Hello from server %s", port);
    }
}
