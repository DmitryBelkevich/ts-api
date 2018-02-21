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
}
