package com.example.babysitterapp.entity.booking;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "TASK_NAME")
    private String taskName;
    @Column(name = "TASK_DESC")
    private String taskDescription;
    @Column(name = "HOURLY_PAY")
    private int hourlyPay;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RESERVATION_DETAIL_ID")
    private ReservationDetail reservationDetail;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASK_REVIEW_ID")
    private TaskReview taskReview;

    public Task() {
    }

    public Task(String taskName, String taskDescription, int hourlyPay, ReservationDetail reservationDetail) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.hourlyPay = hourlyPay;
        this.reservationDetail = reservationDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public ReservationDetail getReservationDetail() {
        return reservationDetail;
    }

    public void setReservationDetail(ReservationDetail reservationDetail) {
        this.reservationDetail = reservationDetail;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", hourlyPay=" + hourlyPay +
                ", reservationDetail=" + reservationDetail +
                '}';
    }
}
