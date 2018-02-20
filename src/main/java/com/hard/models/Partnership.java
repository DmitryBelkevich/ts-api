package com.hard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "partnerships")
public class Partnership extends AbstractModel {
    @Column(name = "title")
    private String title;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "apartment")
    private String apartment;

    @Column(name = "building")
    private String building;

    @Column(name = "post_index")
    private String postIndex;

    @OneToMany(mappedBy = "partnership")
    private Set<Topic> topics;
}
