package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getMessage(){
        return "Hello World!";
    }

    @GetMapping("/name")
    public String grtName(){
        return "Vikky";
    }
}
