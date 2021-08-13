package com.example.babysitterapp.entity.booking;

import javax.persistence.*;

@Entity
@Table(name = "TASK_REVIEW")
public class TaskReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "TASK_NAME")
    private String taskName;
    @Column(name = "TASK_RATE")
    private int rating;
    @OneToOne(mappedBy = "taskReview")
    private Task task;

    public TaskReview() {
    }

    public TaskReview(String taskName, int rating) {
        this.taskName = taskName;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "TaskReview{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
