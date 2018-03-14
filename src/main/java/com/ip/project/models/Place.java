package com.ip.project.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private float latitude;
    @NotNull
    private float longitute;
    @NotNull
    private String address;
    @Column(name = "working_time")
    private String workingTime;
    private String description;
    private String website;
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Column(name = "pricing_rate")
    private int pricingRate;

    @ManyToOne
    @JoinColumn(name = "city_id",nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "type_id",nullable = false)
    private Type type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place",fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place",fetch = FetchType.LAZY)
    private List<Rating> ratings = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place",fetch = FetchType.LAZY)
    private List<VisitedPlaces> visited = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "place",fetch = FetchType.LAZY)
    private List<Photo> photos = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricingRate() {
        return pricingRate;
    }

    public void setPricingRate(int pricingRate) {
        this.pricingRate = pricingRate;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitute() {
        return longitute;
    }

    public void setLongitute(float longitute) {
        this.longitute = longitute;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<VisitedPlaces> getVisited() {
        return visited;
    }

    public void setVisited(List<VisitedPlaces> visited) {
        this.visited = visited;
    }
}
