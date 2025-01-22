package com.example.TestService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.TestService2")
public class TestServiceApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication2.class, args);
    }
}
