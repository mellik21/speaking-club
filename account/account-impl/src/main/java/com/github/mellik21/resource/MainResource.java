package com.github.mellik21.resource;

import com.github.mellik21.api.MainResourceApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource implements MainResourceApi {

    @Override
    public String hello() {
        return "Hello";
    }
}
