package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AttendanceManagementApplication {

//    @Autowired
//    private Flyway flyway;

    public static void main(String[] args) {
        SpringApplication.run(AttendanceManagementApplication.class, args);
    }

}
