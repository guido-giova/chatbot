package com.ggiova.chatbot.service;

import com.ggiova.chatbot.entity.Conversation;
import com.ggiova.chatbot.repository.ConversationRepository;

import java.util.List;

public class ConversationService {
    private final ConversationRepository conversationRepository;
    
    ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }
    
    public List<Conversation> listConversations() {
        return this.conversationRepository.findAll();
    }
}
