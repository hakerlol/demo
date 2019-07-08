package com.example.second.demo.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecondApplication {

    @GetMapping(path="/main")
    public String get(){
        return "wow";
    }

    public static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args);
    }

}
