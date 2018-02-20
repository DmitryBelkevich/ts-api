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
}