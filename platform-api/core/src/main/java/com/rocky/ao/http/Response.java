package com.rocky.ao.http;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author yun.ao
 * @date 2023/1/10 10:36
 * @description
 */
@Data
@Accessors(chain = true)
@ToString
@NoArgsConstructor
public class Response<T> {

    private int code = 200;
    private String msg;
    private T data;

    @Getter
    private boolean isSuccess = (code >= 200 && code < 300);

    public static Response<?> onInternalError() {
        return onError("Oops! something wrong, please connect with admin");
    }

    public static Response<?> onError(String msg) {
        return onError(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static Response<?> onError(int code, String msg) {
        return new Response<>()
            .setCode(code)
            .setMsg(msg)
            .setData(null);
    }

    public static Response<?> onSuccess() {
        return onSuccess("successful");
    }

    public static <T> Response<T> onSuccess(T data) {
        return onSuccess("successful", data);
    }

    public static Response<?> onSuccess(String msg) {
        return onSuccess(msg, null);
    }

    public static <T> Response<T> onSuccess(String msg, T data) {
        return new Response<T>()
            .setMsg(msg)
            .setData(data);
    }
}
