package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorityRepo extends JpaRepository<Authority, Integer> {
}
