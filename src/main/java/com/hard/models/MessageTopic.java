package com.hard.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "messages_topic")
public class MessageTopic extends AbstractMessage {
    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private Topic topic;
}
