package com.kodedu.http2.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static java.util.Objects.isNull;

@RestController
public class HelloController {

    @GetMapping("/get")
    public String get() {
        return "Hello world!";
    }

    @PostMapping("/post")
    public String post(@RequestBody String body) {
        return isNull(body) ? "Hello world!" : body;
    }
}
