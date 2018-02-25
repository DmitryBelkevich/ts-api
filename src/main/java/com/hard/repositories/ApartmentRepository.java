package com.hard.repositories;

import com.hard.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    Collection<Apartment> findByFloor(int floor);
}
