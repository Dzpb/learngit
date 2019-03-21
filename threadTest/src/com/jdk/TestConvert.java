package com.jdk;

@FunctionalInterface
public interface TestConvert<T,F> {
    F convert(T t);
}

