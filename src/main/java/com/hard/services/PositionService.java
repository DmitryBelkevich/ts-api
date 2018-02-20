package com.hard.services;

import com.hard.models.Position;

import java.util.Collection;

public interface PositionService {
    Collection<Position> getAll();

    Position getById(long id);

    Position save(Position position);

    void delete(long id);
}
