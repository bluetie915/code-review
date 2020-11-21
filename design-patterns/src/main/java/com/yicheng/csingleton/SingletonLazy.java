package com.yicheng.csingleton;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 10:55
 */
// 懒汉式单例（懒加载，线程不安全）
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (instance == null)
            instance = new SingletonLazy();
        return instance;
    }
}
