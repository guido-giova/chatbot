package com.ggiova.chatbot.utils;

import java.util.List;
import java.util.function.Function;

/**
 * Helper class for mapping lists for responses
 */
public class ListMapper {
    /**
     * @param data wrapped list
     * @param <T>  the type of elements in the list
     */
    public record ListWrapper<T>(List<T> data) {}
    
    /**
     * Wraps the given list into a ListWrapper.
     *
     * @param toWrap list to be wrapped
     * @param <T>    the type of elements in the list
     * @return a ListWrapper instance containing the given list
     */
    public static <T> ListWrapper<T> toListWrapper(List<T> toWrap) {
        return new ListWrapper<>(toWrap);
    }
    
    /**
     * Applies a transformation (mapping) to each element of the given list and then packages them inside a ListWrapper
     *
     * @param toWrap list to be wrapped
     * @param mapper transformation for each element
     * @param <T>    the type of elements in the original list
     * @param <R>    the type of elements in the resulting list
     * @return a ListWrapper instance containing the given list mapped by the given function
     */
    public static <T, R> ListWrapper<R> toListWrapper(List<T> toWrap, Function<T, R> mapper) {
        return new ListWrapper<>(toWrap.stream().map(mapper).toList());
    }
}
