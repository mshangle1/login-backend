package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test/admin")
public class TestAdminController {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public String test() {
        return "Admin Login successful";
    }


}
