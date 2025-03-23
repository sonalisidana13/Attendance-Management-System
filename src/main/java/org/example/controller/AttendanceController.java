package org.example.controller;

import org.example.service.AttendanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/attendance")
public class AttendanceController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }
}
