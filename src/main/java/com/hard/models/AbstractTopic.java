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
    @JoinColumn(name = "partnership_id", nullable = false)
    private Partnership partnership;

    @Column(name = "date", nullable = false)
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @Column(name = "title", length = 256)
    private String title;

    @Column(name = "description")
    @Type(type = "text")
    private String description;

    public Partnership getPartnership() {
        return partnership;
    }

    public void setPartnership(Partnership partnership) {
        this.partnership = partnership;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
