package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPreferenceRepo extends JpaRepository<UserPreference, Integer>{
}
