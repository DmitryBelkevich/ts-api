package com.hard.services.impl;

import com.hard.models.Partnership;
import com.hard.repositories.PartnershipRepository;
import com.hard.services.PartnershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class PartnershipServiceImpl implements PartnershipService {
    @Autowired
    private PartnershipRepository partnershipRepository;

    @Override
    public Collection<Partnership> getAll() {
        return partnershipRepository.findAll();
    }

    @Override
    public Partnership getById(long id) {
        return partnershipRepository.findOne(id);
    }

    @Override
    public Partnership save(Partnership partnership) {
        return partnershipRepository.save(partnership);
    }

    @Override
    public void delete(long id) {
        partnershipRepository.delete(id);
    }
}
