package com.yicheng.spring.testProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    // xml 定义 init 方法
    public void init() {
        System.out.println("obj init");
    }

    // xml 定义 destory 方法
    public void destory() {
        System.out.println("obj destory");
    }

}