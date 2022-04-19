package com.example.demo.service;

import com.example.demo.entity.AppUser;
import com.example.demo.enums.AppUserRole;
import com.example.demo.model.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {

        appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );

        return "Registration Success";

    }
}
