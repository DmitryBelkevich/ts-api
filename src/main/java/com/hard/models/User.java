package com.hard.models;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends AbstractModel {
    @Column(name = "username", length = 64, nullable = false)
    private String username;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "surname", length = 64)
    private String surname;

    @Column(name = "patronymic", length = 64)
    private String patronymic;

    @Column(name = "phone", length = 64)
    private String phone;

    @Column(name = "avatar", length = 1024)
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

    @JoinTable(
            name = "users_partnerships_positions_relations",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "position_id")
            }
    )
    @MapKeyJoinColumn(name = "partnership_id")
    @ElementCollection
    private Map<Partnership, Position> partnershipsPositions;

    @OneToMany(mappedBy = "owner")
    private Set<Apartment> ownApartments;

    @ManyToMany
    @JoinTable(
            name = "users_apartments_relations",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "apartment_id")
    )
    private Set<Apartment> apartments;

    @OneToMany(mappedBy = "author")
    private Set<Topic> topics;

    @OneToMany(mappedBy = "user")
    private Set<MessageTopic> messagesTopics;
}
