package com.ggiova.chatbot.mapper;

import com.ggiova.chatbot.dto.ListWrapper;

import java.util.List;

/**
 * Maps from the entity to the DTO
 *
 * @param <E> Entity (source)
 * @param <D> DTO (Target)
 */
public interface MapperParent<E, D> {
    /**
     * Maps the given entity into the DTO
     *
     * @param entity that will be mapped
     * @return the DTO that represents the entity
     */
    D toDto(E entity);
    
    /**
     * Maps each one of the given entities into their DTOs
     *
     * @param entities that will be mapped
     * @return A list containing DTOs
     */
    List<D> toDtoList(List<E> entities);
    
    /**
     * Maps the given entities into their DTOs and then wraps them in ListWrapper
     *
     * @param entities that will be mapped
     * @return a wrapper containing the mapped DTOs
     * @see ListWrapper
     */
    default ListWrapper<D> toListWrapper(List<E> entities) {
        return new ListWrapper<>(this.toDtoList(entities));
    }
}
