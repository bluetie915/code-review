package com.yicheng.spring.testFactory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 可以同时使用接口的初始化和销毁与 xml 配置的初始化与销毁方法
// 同时使用时会优先调用接口的方法，再经过 xml 配置找到对应的方法
public class HelloWorld implements InitializingBean, DisposableBean {
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

    // 实现接口定义 init 方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("obj init -- this is implements interface");
    }

    // 实现接口定义 destory 方法
    @Override
    public void destroy() throws Exception {
        System.out.println("obj destory -- this is implements interface");
    }
}