package com.ggiova.chatbot.mapper;

import com.ggiova.chatbot.dto.ListWrapper;

import java.util.List;

public interface MapperParent<E, D> {
    D toDto(E entity);
    List<D> toDtoList(List<E> entities);
    
    default ListWrapper<D> toListWrapper(List<E> entities) {
        return new ListWrapper<>(this.toDtoList(entities));
    }
}
