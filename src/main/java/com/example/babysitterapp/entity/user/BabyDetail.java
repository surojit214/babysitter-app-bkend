package com.example.babysitterapp.entity.user;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BABY_DETAIL")
public class BabyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "BABY_NAME")
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;

    public BabyDetail() {
    }

    public BabyDetail(String dob, String gender, String name, User user) {
        this.dob = dob;
        this.gender = gender;
        this.name = name;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BabyDetail{" +
                "id=" + id +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
