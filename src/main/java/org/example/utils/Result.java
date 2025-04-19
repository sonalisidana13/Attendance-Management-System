package org.example.utils;

public class Result<T> {
    private String error;
    private T value;

    public static <T> Result<T> fail(String errorMessage) {
        Result<T> result = new Result<>();
        result.error = errorMessage;
        return result;
    }

    public static <T> Result<T> ok(T value) {
        Result<T> result = new Result<>();
        result.value = value;
        return result;
    }

    public boolean isFailure() {
        return error != null;
    }

    public String getError() {
        return error;
    }

    public T getValue() {
        return value;
    }
}