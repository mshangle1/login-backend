package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test/user")
@PreAuthorize("hasRole('ROLE_USER')")
public class TestUserController {

    @GetMapping
    public String test() {
        return "User Login successful";
    }
}
