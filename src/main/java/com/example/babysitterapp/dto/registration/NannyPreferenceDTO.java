package com.example.babysitterapp.dto.registration;

public class NannyPreferenceDTO {
    private Integer id;
    private String preferredBabyGender;
    private Integer babyMinAge;
    private Integer babyMaxAge;
    private Integer babyLocationPerimeter;
    private String jobStartTime;
    private String jobEndTime;

    public NannyPreferenceDTO() {
    }

    public NannyPreferenceDTO(Integer id, String preferredBabyGender, Integer babyMinAge, Integer babyMaxAge, Integer babyLocationPerimeter, String jobStartTime, String jobEndTime) {
        this.id = id;
        this.preferredBabyGender = preferredBabyGender;
        this.babyMinAge = babyMinAge;
        this.babyMaxAge = babyMaxAge;
        this.babyLocationPerimeter = babyLocationPerimeter;
        this.jobStartTime = jobStartTime;
        this.jobEndTime = jobEndTime;
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
        return "NannyPreferenceDTO{" +
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
