package com.example.todoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.todoapplication"})
public class ToDoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);
    }
}
