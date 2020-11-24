package com.yicheng.checkcode.exception;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 9:39
 */
public class MyException extends RuntimeException {

    private int code;
    private String msg;

    public MyException(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
