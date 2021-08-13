package com.example.babysitterapp.dto.login;

public class AuthorityDTO {
    private Integer id;
    private String name;

    public AuthorityDTO() {
    }

    public AuthorityDTO(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorityDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
