package com.study.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by https://github.com/WonJongWoon 2021-11-25, 목, 17:34
 */
@RestController
public class SampleController {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot CI/CD";
    }

}
