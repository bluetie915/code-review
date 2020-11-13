package com.yicheng.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 10:32
 */
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

        // 通过反射调用普通方法
        System.out.println("---------------------");
        User user3 = (User) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // invoke：激活的意思  (对象, "方法的值")
        setName.invoke(user3, "李四");
        System.out.println(user3);

        // 通过反射操作属性
        System.out.println("---------------------");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 不能直接操作私有属性，需要关闭程序的安全检测，属性或者方法的 setAccessible(true)
        name.setAccessible(true);
        name.set(user4, "王二");
        System.out.println(user4);
    }
}
