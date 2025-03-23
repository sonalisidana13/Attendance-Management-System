package org.example.utils;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Result<T> {

    @Getter private T value;
    private boolean success;
    @Getter private String error;
    private boolean failure;

    private Result(boolean success, String error) {
        this.success = success;
        this.failure = !success;
        this.error = error;
    }

    private Result(T value, boolean success, String error) {

        this.value = value;
        this.success = success;
        this.failure = !success;
        this.error = error;
    }

    public boolean isFailure() {
        return !success;
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>(false, message);
    }

    public static <T> Result<T> ok() {
        return new Result<>(true, "");
    }

    public static <T> Result<T> ok(T value) {
        return new Result<>(value, true, "");
    }

    public static <T> Result<T> combine(Result...results) {
        for (Result<T> result : results) {
            if (result.failure) {
                return result;
            }

        }

        return Result.ok();
    }
}