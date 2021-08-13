package com.example.babysitterapp.entities;

import javax.persistence.*;

//@Entity
@Table(name = "PERSON_DETAIL")
public class PersonDetail {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "PAN_NO")
    private String panNo;
    @Column(name = "AADHAR")
    private String aadhar;
    @Column(name = "PASSPORT")
    private String passport;
    @OneToOne(mappedBy = "personDetail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonDetail() {
    }

    public PersonDetail(String panNo, String aadhar, String passport) {
        this.panNo = panNo;
        this.aadhar = aadhar;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "PersonDetail{" +
                "id=" + id +
                ", panNo='" + panNo + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", passport='" + passport + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}
