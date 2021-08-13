package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo extends JpaRepository<UserDetail, Integer> {
}
