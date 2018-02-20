package com.hard.services;

import com.hard.models.Partnership;

import java.util.Collection;

public interface PartnershipService {
    Collection<Partnership> getAll();

    Partnership getById(long id);

    Partnership save(Partnership partnership);

    void delete(long id);
}
