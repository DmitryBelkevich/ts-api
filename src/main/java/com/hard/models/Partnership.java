package com.hard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "partnerships")
public class Partnership extends AbstractModel {
    @Column(name = "title", length = 64, nullable = false)
    private String title;

    @Column(name = "country", length = 64, nullable = false)
    private String country;

    @Column(name = "city", length = 64, nullable = false)
    private String city;

    @Column(name = "street", length = 64, nullable = false)
    private String street;

    @Column(name = "apartment", length = 64, nullable = false)
    private String apartment;

    @Column(name = "building", length = 64)
    private String building;

    @Column(name = "post_index")
    private int postIndex;

    @OneToMany(mappedBy = "partnership")
    private Set<Topic> topics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }
}
