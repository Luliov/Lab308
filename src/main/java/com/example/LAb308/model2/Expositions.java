package com.example.LAb308.model2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Expositions extends Event{

    public Expositions(LocalDate date, LocalTime duration, String location, String title, List<Guest> guests) {
        super(date, duration, location, title, guests);
    }
}
