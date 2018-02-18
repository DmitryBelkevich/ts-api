package com.hard.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends AbstractModel {
    @Column(name = "title")
    @Enumerated(EnumType.STRING)
    private RoleList title;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {

    }

    public RoleList getTitle() {
        return title;
    }

    public void setTitle(RoleList title) {
        this.title = title;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
