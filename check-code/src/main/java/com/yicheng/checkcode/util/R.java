package com.yicheng.checkcode.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 10:19
 */
@Data
@Accessors(chain = true)
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int SUCCESS = 1;
    private static final int FAIL = 0;

    /**
     * 返回标记：成功标记=1，失败标记=0
     */
    private Integer code;

    /**
     * 数据
     */
    private T data;

    /**
     * 信息
     */
    private String msg;

    /**
     * 分页总数量
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long count;

    public static <T> R<T> ok() {
        return restResult(null, SUCCESS, "操作成功");
    }

    public static <T> R<T> ok(T data) {
        return restResult(data, SUCCESS, "success");
    }

    public static <T> R<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> R<T> ok(String msg) {
        return restResult(null, SUCCESS, msg);
    }

    public static <T> R<T> ok(List<T> result, Long total) {
        return (R<T>) restResult(result, SUCCESS, "", total);
    }

    public static <T> R<T> failed() {
        return restResult(null, FAIL, "操作失败");
    }

    public static <T> R<T> failed(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> R<T> failed(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> R<T> failed(T data) {
        return restResult(data, FAIL, null);
    }

    public static <T> R<T> failed(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    private static <T> R<T> restResult(T data, int code, String msg) {
        return restResult(data, code, msg, null);
    }

    private static <T> R<T> restResult(T data, int code, String msg, Long count) {
        R<T> apiResult = new R<>();
        apiResult.setData(data);
        apiResult.setCode(code);
        apiResult.setMsg(msg);
        apiResult.setCount(count);
        return apiResult;
    }
}

