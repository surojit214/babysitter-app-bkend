package com.example.babysitterapp.entity.user;

import com.example.babysitterapp.entity.booking.Reservation;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "PHONE_NO")
    private String phoneNo;
    @Column(name = "USER_TYPE")
    private String userType;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_DETAIL_ID")
    private UserDetail userDetail;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_PREFERENCE_ID")
    private UserPreference userPreference;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NANNY_PREFERENCE_ID")
    private NannyPreference nannyPreference;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
    private List<Reservation> reservations = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private List<BabyDetail> babyDetails = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_AUTHORITY", joinColumns = {@JoinColumn(name = "USER_ID")}, inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_ID")})
    private Set<Authority> authorities = new HashSet<>();

    public User() {
    }

    public User(String name, String email, String gender, String phoneNo, String userType, UserDetail userDetail, UserPreference userPreference, NannyPreference nannyPreference, List<Reservation> reservations, List<BabyDetail> babyDetails) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.userType = userType;
        this.userDetail = userDetail;
        this.userPreference = userPreference;
        this.nannyPreference = nannyPreference;
        this.reservations = reservations;
        this.babyDetails = babyDetails;
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

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public UserPreference getUserPreference() {
        return userPreference;
    }

    public void setUserPreference(UserPreference userPreference) {
        this.userPreference = userPreference;
    }

    public NannyPreference getNannyPreference() {
        return nannyPreference;
    }

    public void setNannyPreference(NannyPreference nannyPreference) {
        this.nannyPreference = nannyPreference;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void addAuthority(Authority authority) {
        this.authorities.add(authority);
    }

    public void removeAuthority(Authority authority) {
        this.authorities.remove(authority);
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public void removeReservation(Reservation reservation) {
        this.reservations.remove(reservation);
    }

    public List<BabyDetail> getBabyDetails() {
        return babyDetails;
    }

    public void addBabyDetail(BabyDetail babyDetail) {
        this.babyDetails.add(babyDetail);
    }

    public void setBabyDetails(List<BabyDetail> babyDetails) {
        this.babyDetails = babyDetails;
    }

    public void removeBabyDetail(BabyDetail babyDetail) {
        this.babyDetails.remove(babyDetail);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", userType='" + userType + '\'' +
                ", userDetail=" + userDetail +
                ", userPreference=" + userPreference +
                ", nannyPreference=" + nannyPreference +
                ", reservations=" + reservations +
                ", babyDetails=" + babyDetails +
                '}';
    }
}
