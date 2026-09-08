package com.ggiova.chatbot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Represents one chat thread, storing the id, the title and the message history.
 *
 * @see ChatMessage
 */
@Document(collection = "conversations")
public final class Conversation {
    @Id
    @Getter
    private final String id;
    
    @Getter
    @Setter
    private String title;
    
    private final List<ChatMessage> messages;
    
    /**
     * Creates an instance of Conversation with a given id, title, and message history. Used by Spring Data when
     * reconstructing a Conversation from MongoDB.
     *
     * @param id       of the conversation
     * @param title    of the conversation
     * @param messages of the conversation
     */
    @PersistenceCreator
    public Conversation(String id, String title, List<ChatMessage> messages) {
        this.id = id;
        this.title = title;
        this.messages = new ArrayList<>(messages != null ? messages : List.of());
    }
    
    /**
     * Creates an instance of Conversation with a given id, a title and an empty conversation.
     *
     * @param id    of the conversation
     * @param title of the conversation
     */
    public Conversation(String id, String title) {
        this(id, title, new java.util.ArrayList<>());
    }
    
    /**
     * Creates an instance of Conversation with a given title but a random id.
     *
     * @param title of the conversation
     * @see java.util.UUID
     */
    public Conversation(String title) {
        this(UUID.randomUUID().toString(), title);
    }
    
    /**
     * Adds a message to the conversation.
     *
     * @param message to be added.
     */
    public void addMessage(ChatMessage message) {this.messages.add(message);}
    
    /**
     * @return an unmodifiable list of all the messages.
     * @see java.util.Collections
     */
    public List<ChatMessage> getMessages() {
        return Collections.unmodifiableList(this.messages);
    }
    
    /**
     * Informs whether the conversation has no messages.
     *
     * @return {@code true} if the conversation has no messages, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return this.messages.isEmpty();
    }
    
    @Override
    public String toString() {
        return this.title;
    }
}