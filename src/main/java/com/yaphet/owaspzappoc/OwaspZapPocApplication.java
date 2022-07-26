package com.yaphet.owaspzappoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class OwaspZapPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(OwaspZapPocApplication.class, args);
    }

    @GetMapping
    public String hello(){
        return "hello";
    }
}
