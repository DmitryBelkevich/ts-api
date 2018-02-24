package com.hard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "issues")
public class Issue extends AbstractTopic {
    @OneToMany(mappedBy = "issue")
    private Set<MessageIssue> messagesIssues;

    @Column(name = "importance")
    private int importance;

    @Column(name = "process_status", nullable = false)
    private int processStatus;

    public Set<MessageIssue> getMessagesIssues() {
        return messagesIssues;
    }

    public void setMessagesIssues(Set<MessageIssue> messagesIssues) {
        this.messagesIssues = messagesIssues;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public int getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(int processStatus) {
        this.processStatus = processStatus;
    }
}
