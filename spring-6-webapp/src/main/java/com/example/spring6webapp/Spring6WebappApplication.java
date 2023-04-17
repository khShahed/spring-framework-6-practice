package com.example.spring6webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebMvc
public class Spring6WebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring6WebappApplication.class, args);
    }

}
