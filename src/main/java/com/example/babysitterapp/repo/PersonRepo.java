package com.example.babysitterapp.repo;

import com.example.babysitterapp.entities.Person;
import com.example.babysitterapp.enums.GenderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface PersonRepo /*extends JpaRepository<Person, Integer>*/ {
    /*@Query("select p from Person p where p.gender = :gender order by p.firstName DESC")
    public List<Person> findAllByGender(@Param("gender") GenderType genderType);*/
}
