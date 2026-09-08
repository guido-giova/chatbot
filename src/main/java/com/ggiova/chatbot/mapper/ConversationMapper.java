package com.ggiova.chatbot.mapper;

import com.ggiova.chatbot.dto.conversation.ConversationListingDTO;
import com.ggiova.chatbot.entity.Conversation;
import org.mapstruct.Mapper;

/**
 * Mapper for the Conversations
 */
@Mapper(componentModel = "spring")
public interface ConversationMapper
         extends MapperParent<Conversation, ConversationListingDTO> {
}
