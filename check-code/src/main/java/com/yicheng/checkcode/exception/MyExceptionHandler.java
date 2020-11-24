package com.yicheng.checkcode.exception;

import com.yicheng.checkcode.util.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 10:19
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MyException.class)
    public R handleMyException(MyException e){
        return R.failed(e.getCode(), e.getMsg());
    }
}
