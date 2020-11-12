package com.yicheng.annotation;

import java.lang.annotation.*;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 16:15
 */
// 测试元注解
public class TestAnnotation2 {

    @MyAnnotation
    public void test() {

    }

}

// 定义一个注解
// Target 表示注解可以放在什么上面
@Target(ElementType.METHOD)

// Retention 表示注解在什么地方还有效
// runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

// Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented

// Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation {

}