package com.yicheng.csingleton;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 11:48
 */
public class SingletonTest {
    public static void main(String[] args) {
        SingletonHungry instance1 = SingletonHungry.getInstance();
        SingletonHungry instance2 = SingletonHungry.getInstance();
        System.out.println("测试饿汉单例：" + (instance1 == instance2));

        SingletonLazy instance3 = SingletonLazy.getInstance();
        SingletonLazy instance4 = SingletonLazy.getInstance();
        System.out.println("测试懒汉单例：" + (instance3 == instance4));

        SingletonDoubleCheck instance5 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance6 = SingletonDoubleCheck.getInstance();
        System.out.println("测试双重检测单例：" + (instance5 == instance6));
    }
}
