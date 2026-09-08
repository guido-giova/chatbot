package com.ggiova.chatbot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ai_models")
public abstract class AiModel {
    @Id
    private String id;
    private String name;
    private String digest;
    private Long sizeBytes;
}
