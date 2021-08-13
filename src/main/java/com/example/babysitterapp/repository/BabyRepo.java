package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.BabyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepo extends JpaRepository<BabyDetail, Integer> {
}
