package com.example.babysitterapp.entity.booking;

import javax.persistence.*;

@Entity
@Table(name = "USER_REVIEW")
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "USER_RATINH")
    private int rating;
    @Column(name = "USER_REVIEW_COMMENT")
    private String reviewComment;

    public UserReview() {
    }

    public UserReview(int rating, String reviewComment) {
        this.rating = rating;
        this.reviewComment = reviewComment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    @Override
    public String toString() {
        return "UserReview{" +
                "id=" + id +
                ", rating=" + rating +
                ", reviewComment='" + reviewComment + '\'' +
                '}';
    }
}
