package com.example.renderdemo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "123456".equals(password);
    }
}