package com.hard.repositories;

import com.hard.models.MessageTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageTopicRepository extends JpaRepository<MessageTopic, Long> {

}
