package com.hard.services;

import com.hard.models.Role;

import java.util.Collection;

public interface RoleService {
    Collection<Role> getAll();

    Role getById(long id);

    Role save(Role role);

    void delete(long id);
}
