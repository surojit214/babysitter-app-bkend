package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    public List<User> findByUserType(String userType);

    public User findUserByEmail(String email);
}
