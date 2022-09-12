package com.example.cicdprac;

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
}