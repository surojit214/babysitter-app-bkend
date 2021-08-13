package com.example.babysitterapp.entities;

import com.example.babysitterapp.entity.user.NannyPreference;
import com.example.babysitterapp.entity.user.UserPreference;

import javax.persistence.*;

@Entity
@Table
public abstract class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "PHONE_NO")
    private String phoneNo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_PREFERENCE_ID")
    private UserPreference userPreference;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NANNY_PREFERENCE_ID")
    private NannyPreference nannyPreference;
}
