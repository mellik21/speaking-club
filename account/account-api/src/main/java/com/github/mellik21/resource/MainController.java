package com.github.mellik21.resource;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/")
public interface MainController {

    @ApiOperation(value = "Home page")
    @GetMapping(value = "/hello")
    String hello();

}
