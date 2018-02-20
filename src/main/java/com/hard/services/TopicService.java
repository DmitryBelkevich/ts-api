package com.hard.services;

import com.hard.models.Topic;

import java.util.Collection;

public interface TopicService {
    Collection<Topic> getAll();

    Topic getById(long id);

    Topic save(Topic topic);

    void delete(long id);
}
