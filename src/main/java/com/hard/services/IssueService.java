package com.hard.services;

import com.hard.models.Issue;

import java.util.Collection;

public interface IssueService {
    Collection<Issue> getAll();

    Issue getById(long id);

    Issue save(Issue issue);

    void delete(long id);
}
