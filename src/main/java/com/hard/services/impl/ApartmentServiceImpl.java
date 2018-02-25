package com.hard.services.impl;

import com.hard.models.Apartment;
import com.hard.repositories.ApartmentRepository;
import com.hard.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public Collection<Apartment> getAll() {
        return apartmentRepository.findAll();
    }

    @Override
    public Apartment getById(long id) {
        return apartmentRepository.findOne(id);
    }

    @Override
    public Apartment save(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @Override
    public void delete(long id) {
        apartmentRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        apartmentRepository.deleteAll();
    }

    @Override
    public Collection<Apartment> findByFloor(int floor) {
        return apartmentRepository.findByFloor(floor);
    }
}
