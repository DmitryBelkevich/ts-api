package com.hard.services.impl;

import com.hard.models.MessageIssue;
import com.hard.repositories.MessageIssueRepository;
import com.hard.services.MessageIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class MessageIssueServiceImpl implements MessageIssueService {
    @Autowired
    private MessageIssueRepository messageIssueRepository;

    @Override
    public Collection<MessageIssue> getAll() {
        return messageIssueRepository.findAll();
    }

    @Override
    public MessageIssue getById(long id) {
        return messageIssueRepository.findOne(id);
    }

    @Override
    public MessageIssue save(MessageIssue messageIssue) {
        return messageIssueRepository.save(messageIssue);
    }

    @Override
    public void delete(long id) {
        messageIssueRepository.delete(id);
    }
}
