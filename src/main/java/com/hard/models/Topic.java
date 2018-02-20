package com.hard.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "topics")
public class Topic extends AbstractModel {
    @ManyToOne
    @JoinColumn(name = "partnership_id")
    private Partnership partnership;

    @Column(name = "date")
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "title", length = 256)
    private String title;

    @Column(name = "description")
    @Type(type = "text")
    private String description;
}
