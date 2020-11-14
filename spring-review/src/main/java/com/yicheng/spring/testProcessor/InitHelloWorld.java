package com.yicheng.spring.testProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 张艺成
 * @date 2020/11/14 0014 14:35
 */
// Spring——Bean 后置处理器
// Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理。
public class InitHelloWorld implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
        System.out.println("before init :" + beanName);
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
        System.out.println("after init :" + beanName);
        return object;
    }
}
