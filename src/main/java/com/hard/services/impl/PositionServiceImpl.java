package com.hard.services.impl;

import com.hard.models.Position;
import com.hard.repositories.PositionRepository;
import com.hard.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Collection<Position> getAll() {
        return positionRepository.findAll();
    }

    @Override
    public Position getById(long id) {
        return positionRepository.findOne(id);
    }

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void delete(long id) {
        positionRepository.delete(id);
    }
}
