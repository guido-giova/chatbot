package com.ggiova.chatbot.utils;

import java.util.List;

public class ListMapper {
    public record ListWrapper<T>(List<T> data) {}
    
    public static <T> ListWrapper<T> toListWrapper(List<T> toWrap) {
        return new ListWrapper<T>(toWrap);
    }
}
