package com.yicheng.spring.testProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 张艺成
 * @date 2020/11/14 0014 14:40
 */
public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-testProcessor.xml");
        HelloWorld contextBean = (HelloWorld) context.getBean("helloWorld");
        contextBean.getMessage();
    }
}

