package com.hard.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "issues")
public class Issue extends AbstractTopic {
    @OneToMany(mappedBy = "issue")
    private Set<MessageIssue> messagesIssues;
}
