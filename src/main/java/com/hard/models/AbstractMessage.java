package com.hard.models;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class AbstractMessage extends AbstractModel {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "text")
    @Type(type = "text")
    private String text;

    @Column(name = "date")
    private Timestamp date;
}
