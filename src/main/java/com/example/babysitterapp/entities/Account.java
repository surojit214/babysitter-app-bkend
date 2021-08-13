package com.example.babysitterapp.entities;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "ACCOUNT")
public class Account {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ACCOUNT_ID")
    private Person person;

    public Account(String accountNo, String accountType) {
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public Account() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNo='" + accountNo + '\'' +
                ", accountType='" + accountType + '\'' +
                ", person=" + person +
                '}';
    }
}
