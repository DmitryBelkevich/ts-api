package com.hard.models;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends AbstractModel {
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "phone")
    private String phone;

    @Column(name = "avatar")
    private String avatar;

    @ManyToMany
    @JoinTable(
            name = "users_roles_relations",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id")
            }
    )
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(
            name = "users_partnerships_relations",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "partnership_id")
            }
    )
    private Set<Partnership> partnerships;

    @JoinTable(
            name = "users_partnerships_positions_relations",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "position_id")
    )
    @MapKeyJoinColumn(name = "partnership_id")
    @ElementCollection
    private Map<Partnership, Position> partnershipsPositions;

    @OneToMany(mappedBy = "owner")
    private Set<Apartment> ownApartments;
}
