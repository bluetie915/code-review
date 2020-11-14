package com.yicheng.spring.testFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {

        // 使用 Spring BeanFactory 容器创建对象
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans-testFactory.xml"));
        HelloWorld factoryBean = (HelloWorld) factory.getBean("helloWorld");
        factoryBean.getMessage();
        System.out.println(factoryBean.hashCode());
        // 默认是单例模式，两个对象的hashCode值是一样的
        HelloWorld factoryBean2 = (HelloWorld) factory.getBean("helloWorld");
        System.out.println(factoryBean2.hashCode());
        factory.destroySingleton("helloWorld");

        // 使用 Spring ApplicationContext 容器创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-testFactory.xml");
        HelloWorld contextBean = (HelloWorld) context.getBean("helloWorld");
        contextBean.getMessage();
        System.out.println(contextBean.hashCode());
        // 默认是单例模式，两个对象的hashCode值是一样的
        HelloWorld contextBean2 = (HelloWorld) context.getBean("helloWorld");
        System.out.println(contextBean2.hashCode());
    }
}