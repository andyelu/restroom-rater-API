package com.example.restroomraterapi.restrooms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restroom {
    @Id
    private String name;
    private String location;

    public Restroom(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Restroom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
