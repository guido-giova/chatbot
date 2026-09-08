package com.ggiova.chatbot.dto;

/**
 * @param data wrapped list
 * @param <T>  the type of elements in the list
 */
public record ListWrapper<T>(
    java.util.List<T> data
) {}
