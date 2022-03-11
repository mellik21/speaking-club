package com.github.mellik21.resource;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerImpl implements MainController {

    @Override
    public String hello() {
        return "Hello";
    }
}
