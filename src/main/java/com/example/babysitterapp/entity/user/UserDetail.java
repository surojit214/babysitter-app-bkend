package com.example.babysitterapp.entity.user;

import javax.persistence.*;

@Entity
@Table(name = "USER_DETAIL")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;
    @Column(name = "PHOTO_ID")
    private String photoId;
    @Column(name = "PHOTO_ID_NO")
    private String photoIdNumber;
    @Column(name = "DOB")
    private String dob;

    public UserDetail() {
    }

    public UserDetail(String photoId, String photoIdNumber, String dob) {
        this.photoId = photoId;
        this.photoIdNumber = photoIdNumber;
        this.dob = dob;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoIdNumber() {
        return photoIdNumber;
    }

    public void setPhotoIdNumber(String photoIdNumber) {
        this.photoIdNumber = photoIdNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "Id=" + Id +
                ", verificationIdType='" + photoId + '\'' +
                ", verificationIdNumber='" + photoIdNumber + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
