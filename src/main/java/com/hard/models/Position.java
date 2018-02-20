package com.hard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
public class Position extends AbstractModel {
    @Column(name = "title")
    private String title;
}
