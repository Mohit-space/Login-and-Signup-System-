package com.loginpage.LoginSignup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.loginpage.LoginSignup.entity")
@EnableJpaRepositories("com.loginpage.LoginSignup.repository")
public class LoginSignupApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginSignupApplication.class, args);
    }
}
