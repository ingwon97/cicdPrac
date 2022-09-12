package com.example.cicdprac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        String testStr = "CI/CD TEST";
        System.out.println(testStr);
        return testStr;
    }

    @GetMapping("/")
    public String main() {
        return "CI/CD TEST 성공";
    }

    @Value("${override.value}")
    private String value;

    @GetMapping("/data")
    public String value() {
        System.out.println(value);
        return "data";
    }

    @GetMapping("/update")
    public String update() {
        return "update 확인";
    }
}