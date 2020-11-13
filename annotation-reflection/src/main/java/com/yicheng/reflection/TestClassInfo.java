package com.yicheng.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 9:55
 */
// 获得类信息
public class TestClassInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.yicheng.reflection.User");

        // 获得类的名字
        System.out.println(c1.getName()); // 获得包名 + 类名
        System.out.println(c1.getSimpleName()); // 获得类名

        // 获得类的属性
        System.out.println("-----------------------------");
        Field[] fields = c1.getFields(); // 只能找到public属性
        fields = c1.getDeclaredFields(); // 找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获得指定属性的值
        System.out.println("-----------------------------");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        // 获得类的方法
        System.out.println("-----------------------------");
        Method[] methods = c1.getMethods(); // 获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的方法" + method);
        }
        System.out.println("-----------------------------");
        methods = c1.getDeclaredMethods(); // 获得本类所有的方法，包括 private 方法
        for (Method method : methods) {
            System.out.println("本类的方法" + method);
        }

        // 获得指定方法
        System.out.println("-----------------------------");
        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        // 获得类的构造器
        System.out.println("-----------------------------");
        Constructor[] constructors = c1.getConstructors(); // 获得public构造方法
        for (Constructor constructor : constructors) {
            System.out.println("public构造方法" + constructor);
        }
        System.out.println("-----------------------------");
        constructors = c1.getDeclaredConstructors(); // 获得全部构造方法
        for (Constructor constructor : constructors) {
            System.out.println("全部构造方法" + constructor);
        }

        // 获得指定的构造器
        System.out.println("-----------------------------");
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器" + declaredConstructor);
    }
}

