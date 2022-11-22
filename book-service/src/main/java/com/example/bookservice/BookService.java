package com.example.bookservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookService {
    @RequestMapping(value = "/recommended")
    public String recommendedBook() {
        return "Spring in Action (Manning), Cloud Native Java (0'Reilly), Learning Spring Boot (Packt)";
    }
}
