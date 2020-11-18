package com.yicheng.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 10:32
 */
// Class对象调用方法
public class TestClassOperateMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException,
            InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.yicheng.reflection.User");

        // 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // invoke：激活的意思  (对象, "方法的值")
        setName.invoke(user3, "李四");
        System.out.println(user3);
    }
}
