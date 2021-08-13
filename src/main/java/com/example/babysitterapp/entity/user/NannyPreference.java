package com.example.babysitterapp.entity.user;

import javax.persistence.*;

@Entity
@Table(name = "NANNY_PREFERENCE")
public class NannyPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PREFERRED_BABY_GENDER")
    private String preferredBabyGender;
    @Column(name = "BABY_MIN_AGE")
    private Integer babyMinAge;
    @Column(name = "BABY_MAX_AGE")
    private Integer babyMaxAge;
    @Column(name = "LOCATION_RADIUS")
    private Integer babyLocationPerimeter;
    @Column(name = "START_TIME")
    private String jobStartTime;
    @Column(name = "END_TIME")
    private String jobEndTime;

    public NannyPreference(String preferredBabyGender, Integer babyMinAge, Integer babyMaxAge, Integer babyLocationPerimeter, String jobStartTime, String jobEndTime) {
        this.preferredBabyGender = preferredBabyGender;
        this.babyMinAge = babyMinAge;
        this.babyMaxAge = babyMaxAge;
        this.babyLocationPerimeter = babyLocationPerimeter;
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
    }

    public NannyPreference() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreferredBabyGender() {
        return preferredBabyGender;
    }

    public void setPreferredBabyGender(String preferredBabyGender) {
        this.preferredBabyGender = preferredBabyGender;
    }

    public Integer getBabyMinAge() {
        return babyMinAge;
    }

    public void setBabyMinAge(Integer babyMinAge) {
        this.babyMinAge = babyMinAge;
    }

    public Integer getBabyMaxAge() {
        return babyMaxAge;
    }

    public void setBabyMaxAge(Integer babyMaxAge) {
        this.babyMaxAge = babyMaxAge;
    }

    public Integer getBabyLocationPerimeter() {
        return babyLocationPerimeter;
    }

    public void setBabyLocationPerimeter(Integer babyLocationPerimeter) {
        this.babyLocationPerimeter = babyLocationPerimeter;
    }

    public String getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(String jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    public String getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(String jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    @Override
    public String toString() {
        return "NannyPreference{" +
                "id=" + id +
                ", preferredBabyGender='" + preferredBabyGender + '\'' +
                ", babyMinAge=" + babyMinAge +
                ", babyMaxAge=" + babyMaxAge +
                ", babyLocationPerimeter=" + babyLocationPerimeter +
                ", jobStartTime='" + jobStartTime + '\'' +
                ", jobEndTime='" + jobEndTime + '\'' +
                '}';
    }
}
