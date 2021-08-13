package com.example.babysitterapp.entity.booking;

import com.example.babysitterapp.entity.user.BabyDetail;
import com.example.babysitterapp.entity.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "" +
            "RESERVATION_DATE")
    private Date reservationDateTime;
    @Column(name = "DURATION")
    private int duration;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "RESERVATION_DETAIL_ID")
    private ReservationDetail reservationDetail;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BABY_DETAIL_ID")
    private BabyDetail babyDetail;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARENT_ID")
    private User parent;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NANNY_ID")
    private User nanny;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARENT_REVIEW_ID")
    private UserReview parentReview;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NANNY_REVIEW_ID")
    private UserReview nannyReview;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARENT_COMPLAINT_ID")
    private UserComplaint parentComplaint;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "NANNY_COMPLAINT_ID")
    private UserComplaint nannyComplaint;

    public Reservation() {
    }

    public Reservation(Date reservationDateTime, int duration, ReservationDetail reservationDetail, BabyDetail babyDetail, User parent, User nanny, UserReview parentReview, UserReview nannyReview) {
        this.reservationDateTime = reservationDateTime;
        this.duration = duration;
        this.reservationDetail = reservationDetail;
        this.babyDetail = babyDetail;
        this.parent = parent;
        this.nanny = nanny;
        this.parentReview = parentReview;
        this.nannyReview = nannyReview;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(Date reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ReservationDetail getReservationDetail() {
        return reservationDetail;
    }

    public void setReservationDetail(ReservationDetail reservationDetail) {
        this.reservationDetail = reservationDetail;
    }

    public BabyDetail getBabyDetail() {
        return babyDetail;
    }

    public void setBabyDetail(BabyDetail babyDetail) {
        this.babyDetail = babyDetail;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public User getNanny() {
        return nanny;
    }

    public void setNanny(User nanny) {
        this.nanny = nanny;
    }

    public UserReview getParentReview() {
        return parentReview;
    }

    public void setParentReview(UserReview parentReview) {
        this.parentReview = parentReview;
    }

    public UserReview getNannyReview() {
        return nannyReview;
    }

    public void setNannyReview(UserReview nannyReview) {
        this.nannyReview = nannyReview;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", reservationDateTime=" + reservationDateTime +
                ", duration=" + duration +
                ", reservationDetail=" + reservationDetail +
                ", babyDetail=" + babyDetail +
                ", parent=" + parent +
                ", nanny=" + nanny +
                ", parentReview=" + parentReview +
                ", nannyReview=" + nannyReview +
                '}';
    }
}
