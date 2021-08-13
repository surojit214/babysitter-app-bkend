package com.example.babysitterapp.entity.user;

import javax.persistence.*;

@Entity
@Table(name = "USER_PREF")
public class UserPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NANNY_MAX_AGE")
    private Integer nannyMaxAge;
    @Column(name = "NANNY_MIN_AGE")
    private Integer nannyMinAge;
    @Column(name = "NANNY_GENDER")
    private String nannyGender;
    @Column(name = "SEARCH_RADIUS")
    private Integer nannySearchPerimeter;

    public UserPreference() {
    }

    public UserPreference(Integer nannyMaxAge, Integer nannyMinAge, String nannyGender, Integer nannySearchPerimeter) {
        this.nannyMaxAge = nannyMaxAge;
        this.nannyMinAge = nannyMinAge;
        this.nannyGender = nannyGender;
        this.nannySearchPerimeter = nannySearchPerimeter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNannyMaxAge() {
        return nannyMaxAge;
    }

    public void setNannyMaxAge(Integer nannyMaxAge) {
        this.nannyMaxAge = nannyMaxAge;
    }

    public Integer getNannyMinAge() {
        return nannyMinAge;
    }

    public void setNannyMinAge(Integer nannyMinAge) {
        this.nannyMinAge = nannyMinAge;
    }

    public String getNannyGender() {
        return nannyGender;
    }

    public void setNannyGender(String nannyGender) {
        this.nannyGender = nannyGender;
    }

    public Integer getNannySearchPerimeter() {
        return nannySearchPerimeter;
    }

    public void setNannySearchPerimeter(Integer nannySearchPerimeter) {
        this.nannySearchPerimeter = nannySearchPerimeter;
    }

    @Override
    public String toString() {
        return "UserPreference{" +
                "id=" + id +
                ", nannyMaxAge=" + nannyMaxAge +
                ", nannyMinAge=" + nannyMinAge +
                ", nannyGender='" + nannyGender + '\'' +
                ", nannySearchPerimeter=" + nannySearchPerimeter +
                '}';
    }
}
