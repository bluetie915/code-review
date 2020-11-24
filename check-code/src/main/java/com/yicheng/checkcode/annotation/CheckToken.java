package com.yicheng.checkcode.annotation;

import java.lang.annotation.*;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 20:09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckToken {}
