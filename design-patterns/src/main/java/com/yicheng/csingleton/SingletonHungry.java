package com.yicheng.csingleton;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 11:30
 */
// 饿汉式单例（没有懒加载，推荐单线程使用）
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getInstance() {
        return instance;
    }
}
