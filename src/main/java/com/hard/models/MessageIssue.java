package com.hard.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "messages_issues")
public class MessageIssue extends AbstractMessage {
    @ManyToOne
    @JoinColumn(name = "issue_id", nullable = false)
    private Issue issue;
}
