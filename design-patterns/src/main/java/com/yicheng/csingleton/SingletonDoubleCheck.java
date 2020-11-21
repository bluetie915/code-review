package com.yicheng.csingleton;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 11:43
 */
//双重检查（线程安全，效率高）
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null)
                    instance = new SingletonDoubleCheck();
            }
        }
        return instance;
    }
}
