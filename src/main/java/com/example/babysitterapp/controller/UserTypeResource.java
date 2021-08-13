package com.example.babysitterapp.controller;

import com.example.babysitterapp.converter.UserEntityDTOConverter;
import com.example.babysitterapp.dto.registration.UserDTO;
import com.example.babysitterapp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/usertype")
@CrossOrigin
public class UserTypeResource {

    @Autowired
    UserRegistrationService userRegistrationService;

    @GetMapping("/{usertype}")
    public List<UserDTO> getUser(@PathVariable("usertype") String userType) {
        List<UserDTO> userDTOS = new ArrayList<>();
        userRegistrationService.getUserByType(userType).forEach(user -> userDTOS.add(UserEntityDTOConverter.convertToDto(user)));
        return userDTOS;
    }

}
