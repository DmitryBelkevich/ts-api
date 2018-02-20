package com.hard.services;

import com.hard.models.User;

import java.util.Collection;

public interface UserService {
    Collection<User> getAll();

    User getById(long id);

    User save(User user);

    void delete(long id);
}
