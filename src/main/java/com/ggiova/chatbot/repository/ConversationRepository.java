package com.ggiova.chatbot.repository;

import com.ggiova.chatbot.entity.Conversation;

import java.util.List;
import java.util.Optional;

public interface ConversationRepository {
    Conversation create(String title);
    Optional<Conversation> findById(String id);
    List<Conversation> findAll();
    void save(Conversation conversation);
    void delete(String id);
}
