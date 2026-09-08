package com.ggiova.chatbot.controller;

import com.ggiova.chatbot.entity.Conversation;
import com.ggiova.chatbot.service.ConversationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/conversations")
public class ConversationController {
    private final ConversationService conversationService;
    
    ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }
    
    @GetMapping("/list")
    public List<Conversation> listAllConversations() {
        return this.conversationService.listConversations();
    }
}
