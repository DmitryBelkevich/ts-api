package com.hard.services;

import java.util.Collection;

public interface AbstractService<T> {
    Collection<T> getAll();

    T getById(long id);

    T save(T t);

    void delete(long id);

    void deleteAll();
}
