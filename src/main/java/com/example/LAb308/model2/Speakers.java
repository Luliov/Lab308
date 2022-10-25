package com.example.LAb308.model2;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Speakers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalTime presentationDuration;

    public Speakers() {
    }

    public Speakers(String name, LocalTime presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(LocalTime presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
