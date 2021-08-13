package com.example.babysitterapp.entity.booking;

import javax.persistence.*;

@Entity
@Table(name = "USER_COMPLAINT")
public class UserComplaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "COMPLAINT_TYPE")
    private String complaintType;
    @Column(name = "COMPLAINT_DETAIL")
    private String complaintDetail;

    public UserComplaint() {
    }

    public UserComplaint(String complaintType, String complaintDetail) {
        this.complaintType = complaintType;
        this.complaintDetail = complaintDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintDetail() {
        return complaintDetail;
    }

    public void setComplaintDetail(String complaintDetail) {
        this.complaintDetail = complaintDetail;
    }

    @Override
    public String toString() {
        return "UserComplaint{" +
                "id=" + id +
                ", complaintType='" + complaintType + '\'' +
                ", complaintDetail='" + complaintDetail + '\'' +
                '}';
    }
}
