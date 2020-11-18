package com.yicheng.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 张艺成
 * @date 2020/11/15 0015 1:16
 */
// Class 创建对象
public class TestCreateObj {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException,
            InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.yicheng.reflection.User");

        // 构造一个对象
        User user = (User) c1.newInstance(); // 本质是调用了类的无参构造器，如果没有无参构造器，会报错
        System.out.println(user);

        // 通过构造器创建对象
        System.out.println("---------------------");
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("张三", 1, 18);
        System.out.println(user2);
    }
}
