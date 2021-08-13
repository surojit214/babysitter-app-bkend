package com.example.babysitterapp.dto.registration;

public class UserPreferenceDTO {
    private Integer id;
    private Integer nannyMaxAge;
    private Integer nannyMinAge;
    private String nannyGender;
    private Integer nannySearchPerimeter;

    public UserPreferenceDTO() {
    }

    public UserPreferenceDTO(Integer nannyMaxAge, Integer nannyMinAge, String nannyGender, Integer nannySearchPerimeter) {
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
        return "UserPreferenceDTO{" +
                ", nannyMaxAge=" + nannyMaxAge +
                ", nannyMinAge=" + nannyMinAge +
                ", nannyGender='" + nannyGender + '\'' +
                ", nannySearchPerimeter=" + nannySearchPerimeter +
                '}';
    }
}
