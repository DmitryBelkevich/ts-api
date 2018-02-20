package com.hard.services;

import com.hard.models.MessageTopic;

import java.util.Collection;

public interface MessageTopicService {
    Collection<MessageTopic> getAll();

    MessageTopic getById(long id);

    MessageTopic save(MessageTopic messageTopic);

    void delete(long id);
}
