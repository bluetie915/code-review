package com.yicheng.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 16:22
 */
// 自定义注解
public class TestAnnotation3 {

    // 注解可以显示赋值，如果没有默认值，我们必须给注解赋值
    @MyAnnotation2(name = "张三", schools = {"天津大学", "清华大学"})
    public void test() {

    }

    @MyAnnotation3("张三")
    public void test01() {

    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {

    // 注解的参数：参数类型 + 参数名 ();
    String name() default "";

    int age() default 0;

    int id() default -1; // 如果默认值为 -1，代表不存在

    String[] schools();
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String value();
}