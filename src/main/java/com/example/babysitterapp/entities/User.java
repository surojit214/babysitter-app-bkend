package com.example.babysitterapp.entities;

import com.example.babysitterapp.enums.GenderType;
import com.example.babysitterapp.enums.UserType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

//@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String username;
    private String name;
    private Date dob;
    private GenderType gender;
    private UserType userType;
//    private List<Address> primaryAddress;
    private Integer primaryPhone;
    private String pan;
    private String aadhar;
    private boolean isActive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    /*public List<Address> getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(List<Address> primaryAddress) {
        this.primaryAddress = primaryAddress;
    }*/

    public Integer getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(Integer primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Date getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    private boolean isLocked;
    private Date lastAccessed;


}
