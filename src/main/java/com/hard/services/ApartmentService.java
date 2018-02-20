package com.hard.services;

import com.hard.models.Apartment;

import java.util.Collection;

public interface ApartmentService {
    Collection<Apartment> getAll();

    Apartment getById(long id);

    Apartment save(Apartment apartment);

    void delete(long id);
}
