package com.example.babysitterapp.entities;

import java.util.Date;
import java.util.List;

public class Booking {
    private Integer id;
    private Integer custId;
    private Integer babyId;
    private Date bookingDateTime;
    private Integer duration;
    private Integer babysitterId;
    private boolean isActive;
    private List<Activity> activityList;
    private Integer bookingAmount;
    private Status bookingStatus;
}
