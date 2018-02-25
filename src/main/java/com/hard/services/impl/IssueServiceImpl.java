package com.hard.services.impl;

import com.hard.models.Issue;
import com.hard.repositories.IssueRepository;
import com.hard.services.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class IssueServiceImpl implements IssueService {
    @Autowired
    private IssueRepository issueRepository;

    @Override
    public Collection<Issue> getAll() {
        return issueRepository.findAll();
    }

    @Override
    public Issue getById(long id) {
        return issueRepository.findOne(id);
    }

    @Override
    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    @Override
    public void delete(long id) {
        issueRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        issueRepository.deleteAll();
    }
}
