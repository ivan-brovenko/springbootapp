package com.softdev.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "Simple spring boot app";
    }
}
