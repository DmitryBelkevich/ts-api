package com.hard.models;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class AbstractTopic extends AbstractModel {
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
