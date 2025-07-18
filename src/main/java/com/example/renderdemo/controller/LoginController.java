package com.example.renderdemo.controller;


import com.example.renderdemo.model.LoginRequest;
import com.example.renderdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        boolean isValid = loginService.authenticate(request.getUsername(), request.getPassword());
        return isValid ? "Login Success" : "Invalid credentials";
    }
}