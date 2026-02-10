package com.loginpage.LoginSignup.service;

import com.loginpage.LoginSignup.dto.SignupRequest;

public interface AuthService {
    void signup(SignupRequest request);
}
