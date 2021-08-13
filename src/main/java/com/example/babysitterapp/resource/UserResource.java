package com.example.babysitterapp.resource;

import com.example.babysitterapp.entities.User;
import com.example.babysitterapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class UserResource {
    /*@Autowired
    UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return createdUser;

    }*/
}
