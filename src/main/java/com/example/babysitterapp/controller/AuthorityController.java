package com.example.babysitterapp.controller;

import com.example.babysitterapp.converter.UserEntityDTOConverter;
import com.example.babysitterapp.dto.login.AuthorityDTO;
import com.example.babysitterapp.entities.Author;
import com.example.babysitterapp.entity.user.Authority;
import com.example.babysitterapp.repository.AutorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthorityController {
    @Autowired
    AutorityRepo repo;

    @PostMapping("/authority")
    public AuthorityDTO createAuthority(@RequestBody AuthorityDTO authorityDTO) {
        Authority authority = UserEntityDTOConverter.convertToEntity(authorityDTO);
        return UserEntityDTOConverter.convertToDto(repo.save(authority));
    }
}
