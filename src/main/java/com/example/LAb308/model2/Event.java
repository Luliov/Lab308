package com.example.LAb308.model2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Event {

    private LocalDate date;
    private LocalTime duration;
    private String location;
    private String title;
    private List<Guest> guests;


    public Event(LocalDate date, LocalTime duration, String location, String title, List<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
