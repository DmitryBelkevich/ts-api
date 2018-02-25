package com.hard.services;

import com.hard.models.Apartment;

import java.util.Collection;

public interface ApartmentService extends AbstractService<Apartment> {
    Collection<Apartment> findByFloor(int floor);
}
