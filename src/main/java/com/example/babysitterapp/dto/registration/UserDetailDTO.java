package com.example.babysitterapp.dto.registration;

public class UserDetailDTO {
    private Integer Id;
    private String photoId;
    private String photoIdNumber;
    private String dob;

    public UserDetailDTO() {
    }

    public UserDetailDTO(Integer id, String photoId, String photoIdNumber, String dob) {
        Id = id;
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
        return "UserDetailDTO{" +
                "Id=" + Id +
                ", photoId='" + photoId + '\'' +
                ", photoIdNumber='" + photoIdNumber + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
