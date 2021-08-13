package com.example.babysitterapp.dto.registration;

import com.example.babysitterapp.dto.login.AuthorityDTO;

import java.util.List;
import java.util.Set;

public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String phoneNo;
    private String userType;
    private UserPreferenceDTO userPreference;
    private List<BabyDTO> babyDetails;
    private NannyPreferenceDTO nannyPreference;
    private UserDetailDTO userDetail;
    private Set<AuthorityDTO> authorities;

    public UserDTO() {
    }

    public UserDTO(int id, String name, String email, String gender, String phoneNo, String userType, UserPreferenceDTO userPreference,
                   List<BabyDTO> babyDetails, NannyPreferenceDTO nannyPreference, UserDetailDTO userDetail) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.userType = userType;
        this.userPreference = userPreference;
        this.babyDetails = babyDetails;
        this.nannyPreference = nannyPreference;
        this.userDetail = userDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserPreferenceDTO getUserPreference() {
        return userPreference;
    }

    public void setUserPreference(UserPreferenceDTO userPreference) {
        this.userPreference = userPreference;
    }

    public List<BabyDTO> getBabyDetails() {
        return babyDetails;
    }

    public void setBabyDetails(List<BabyDTO> babyDetails) {
        this.babyDetails = babyDetails;
    }

    public NannyPreferenceDTO getNannyPreference() {
        return nannyPreference;
    }

    public void setNannyPreference(NannyPreferenceDTO nannyPreference) {
        this.nannyPreference = nannyPreference;
    }

    public UserDetailDTO getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetailDTO userDetail) {
        this.userDetail = userDetail;
    }

    public Set<AuthorityDTO> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<AuthorityDTO> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", userType='" + userType + '\'' +
                ", nannyPreference='" + nannyPreference + '\'' +
                ", userDetail='" + userDetail + '\'' +
                ", authorities='" + authorities + '\'' +
                '}';
    }
}
