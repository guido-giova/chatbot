package com.ggiova.chatbot.utils;

import java.util.List;
import java.util.function.Function;

public class ListMapper {
    public record ListWrapper<T>(List<T> data) {}
    
    public static <T> ListWrapper<T> toListWrapper(List<T> toWrap) {
        return new ListWrapper<T>(toWrap);
    }
    
    public static <T, R> ListWrapper<R> toListWrapper(List<T> toWrap, Function<T, R> mapper) {
        return new ListWrapper<>(toWrap.stream().map(mapper).toList());
    }
}
