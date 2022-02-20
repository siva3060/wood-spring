package com.sivacharan.woodspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/health-check")
    public String HealthCheck(){
       return "KEEP_ALIVE_OK";
    }
}
