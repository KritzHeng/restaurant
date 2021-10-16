package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;


    private String name;
    private String address;
    private String phone;
    private int numSeats;

    @JsonProperty("price_range")
    private int priceRange;
    //  ให้ Generate..
    //       - Getters และ Setters ทั้งหมด

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null)
            this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        if (address != null)
            this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        if (phone != null)
            this.phone = phone;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        if (numSeats > 0)
            this.numSeats = numSeats;
    }
    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        if (priceRange > 0)
            this.priceRange = priceRange;
    }
}
