package com.example.LAb308.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameChapter;
    private String district;
    @ManyToOne
    @JoinColumn(name = "president_id")
    private Member president;

    List<Member> memberList = new ArrayList<>();

    public Chapter() {
    }

    public Chapter(String nameChapter, String district, Member president, List<Member> memberList) {
        this.nameChapter = nameChapter;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameChapter() {
        return nameChapter;
    }

    public void setNameChapter(String nameChapter) {
        this.nameChapter = nameChapter;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

}
