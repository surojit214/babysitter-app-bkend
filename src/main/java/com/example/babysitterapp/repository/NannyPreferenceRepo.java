package com.example.babysitterapp.repository;

import com.example.babysitterapp.entity.user.NannyPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NannyPreferenceRepo extends JpaRepository<NannyPreference, Integer> {
}
