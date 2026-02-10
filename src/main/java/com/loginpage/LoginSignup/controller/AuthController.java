package com.loginpage.LoginSignup.controller;

import com.loginpage.LoginSignup.dto.SignupRequest;
import com.loginpage.LoginSignup.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    // MANUAL constructor for final field
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody @Valid SignupRequest request) {
        authService.signup(request);
        return ResponseEntity.ok("User registered successfully");
    }
}




