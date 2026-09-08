package com.ggiova.chatbot.repository;

import com.ggiova.chatbot.entity.Conversation;

import java.util.*;

public class InMemoryConversationRepository implements ConversationRepository {
    private final Map<String, Conversation> store = new LinkedHashMap<>();
    
    @Override
    public Conversation create(String title) {
        Conversation conversation = new Conversation(title);
        store.put(conversation.getId(), conversation);
        return conversation;
    }
    
    @Override
    public Optional<Conversation> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }
    
    @Override
    public List<Conversation> findAll() {
        return new ArrayList<>(store.values());
    }
    
    @Override
    public void save(Conversation conversation) {
        store.put(conversation.getId(), conversation);
    }
    
    @Override
    public void delete(String id) {
        store.remove(id);
    }
}
