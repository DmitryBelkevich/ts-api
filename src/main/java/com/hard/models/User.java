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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Map<Partnership, Position> getPartnershipsPositions() {
        return partnershipsPositions;
    }

    public void setPartnershipsPositions(Map<Partnership, Position> partnershipsPositions) {
        this.partnershipsPositions = partnershipsPositions;
    }

    public Set<Apartment> getOwnApartments() {
        return ownApartments;
    }

    public void setOwnApartments(Set<Apartment> ownApartments) {
        this.ownApartments = ownApartments;
    }

    public Set<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(Set<Apartment> apartments) {
        this.apartments = apartments;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }

    public Set<MessageTopic> getMessagesTopics() {
        return messagesTopics;
    }

    public void setMessagesTopics(Set<MessageTopic> messagesTopics) {
        this.messagesTopics = messagesTopics;
    }
}
