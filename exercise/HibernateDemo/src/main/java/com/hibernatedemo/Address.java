package com.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "Street_Number")
    private Integer streetNumer;

    @Column(name = "Location")
    private String location;

    @Column(name = "State")
    private String state;

    public Integer getStreetNumer() {
        return streetNumer;
    }

    public void setStreetNumer(Integer streetNumer) {
        this.streetNumer = streetNumer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
