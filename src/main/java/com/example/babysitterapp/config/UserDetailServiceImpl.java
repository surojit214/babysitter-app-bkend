package com.example.babysitterapp.config;

import com.example.babysitterapp.entity.user.User;
import com.example.babysitterapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userByEmail = userRepo.findUserByEmail(username);
        UserDetailImpl userDetail = new UserDetailImpl(userByEmail);
        return userDetail;
    }
}
