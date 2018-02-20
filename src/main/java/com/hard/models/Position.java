package com.hard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
public class Position extends AbstractModel {
    @Column(name = "title_ru")
    private String titleRu;

    @Column(name = "title_en")
    private String titleEn;
}
