package com.example.demo.controller;

import com.example.demo.enums.AppUserRole;
import com.example.demo.model.RegistrationRequest;
import com.example.demo.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(path = "/user")
    public String registerUser(@RequestBody RegistrationRequest request) {
        return registrationService.register(request, AppUserRole.USER);
    }

    @PostMapping(path = "/admin")
    public String registerAdmin(@RequestBody RegistrationRequest request) {
        return registrationService.register(request, AppUserRole.ADMIN);
    }

}
