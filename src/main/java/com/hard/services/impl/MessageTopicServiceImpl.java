package com.hard.services.impl;

import com.hard.models.MessageTopic;
import com.hard.repositories.MessageTopicRepository;
import com.hard.services.MessageTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class MessageTopicServiceImpl implements MessageTopicService {
    @Autowired
    private MessageTopicRepository messageTopicRepository;

    @Override
    public Collection<MessageTopic> getAll() {
        return messageTopicRepository.findAll();
    }

    @Override
    public MessageTopic getById(long id) {
        return messageTopicRepository.findOne(id);
    }

    @Override
    public MessageTopic save(MessageTopic messageTopic) {
        return messageTopicRepository.save(messageTopic);
    }

    @Override
    public void delete(long id) {
        messageTopicRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        messageTopicRepository.deleteAll();
    }
}
