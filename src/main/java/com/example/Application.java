package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Application {
    @RequestMapping(path = "/")
    public ResponseEntity<?> greet() {
        return ResponseEntity.ok("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
