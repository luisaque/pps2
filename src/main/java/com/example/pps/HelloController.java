package com.example.pps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@GetMapping("/hello")
    public String hello() {
        return "Hello luis";
    }
