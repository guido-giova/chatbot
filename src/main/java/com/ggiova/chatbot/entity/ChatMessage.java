package com.ggiova.chatbot.entity;

/**
 * A single turn in a conversation. Immutable by design as messages can't be changed.
 *
 * @param role    Whoever is speaking.
 * @param content What is being said.
 */
public record ChatMessage(String role, String content) {
    /**
     * Creates a ChatMessage object from the user with the given content.
     *
     * @param content What the user said.
     * @return A ChatMessage object from the user with the given content.
     */
    public static ChatMessage user(String content) {
        return new ChatMessage("user", content);
    }
    
    /**
     * Creates a ChatMessage object from the assistant with the given content.
     *
     * @param content What the user said.
     * @return A ChatMessage object from the assistant with the given content.
     */
    public static ChatMessage assistant(String content) {
        return new ChatMessage("assistant", content);
    }
}
