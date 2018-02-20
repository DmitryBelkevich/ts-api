package com.hard.services;

import com.hard.models.MessageIssue;

import java.util.Collection;

public interface MessageIssueService {
    Collection<MessageIssue> getAll();

    MessageIssue getById(long id);

    MessageIssue save(MessageIssue messageIssue);

    void delete(long id);
}
