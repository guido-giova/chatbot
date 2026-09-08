package com.ggiova.chatbot.repository;

import com.ggiova.chatbot.entity.Conversation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepository extends MongoRepository<Conversation, String> {
}
