package com.hard.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends AbstractModel {
    @Column(name = "title", length = 64)
    @Enumerated(EnumType.STRING)
    private RolesList title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
