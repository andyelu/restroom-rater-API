package com.example.restroomraterapi.restrooms;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Review {
    @Id
    @SequenceGenerator(
            name = "review_sequence",
            sequenceName = "review_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "review_sequence"
    )
    private Long review_id;
    private String restroom_name;
    private double rating;
    private String gender;
    private boolean wheelChair;
    private boolean allGender;
    private String tag1;
    private String tag2;
    private String tag3;
    private String comment;
    @Transient
    private String date;

    public Review() {
    }

    public Review(Long review_id, String restroom_name, double rating,
                  String gender, boolean wheelChair, boolean allGender,
                  String tag1, String tag2, String tag3, String comment) {
        this.review_id = review_id;
        this.restroom_name = restroom_name;
        this.rating = rating;
        this.gender = gender;
        this.wheelChair = wheelChair;
        this.allGender = allGender;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        this.comment = comment;
    }

    public Review(String restroom_name, double rating, String gender, boolean wheelChair,
                  boolean allGender, String tag1, String tag2, String tag3, String comment) {
        this.restroom_name = restroom_name;
        this.rating = rating;
        this.gender = gender;
        this.wheelChair = wheelChair;
        this.allGender = allGender;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        this.comment = comment;
    }



    public String getRestroom_name() {
        return restroom_name;
    }

    public void setRestroom_name(String restroom_name) {
        this.restroom_name = restroom_name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isWheelChair() {
        return wheelChair;
    }

    public void setWheelChair(boolean wheelChair) {
        this.wheelChair = wheelChair;
    }

    public boolean isAllGender() {
        return allGender;
    }

    public void setAllGender(boolean allGender) {
        this.allGender = allGender;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return LocalDate.now();
    }

    public Long getReview_id() {
        return review_id;
    }

    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }
}
