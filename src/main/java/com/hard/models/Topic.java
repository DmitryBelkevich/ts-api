package com.hard.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "topics")
public class Topic extends AbstractTopic {
    @OneToMany(mappedBy = "topic")
    private Set<MessageTopic> messagesTopics;

    public Set<MessageTopic> getMessagesTopics() {
        return messagesTopics;
    }

    public void setMessagesTopics(Set<MessageTopic> messagesTopics) {
        this.messagesTopics = messagesTopics;
    }
}
