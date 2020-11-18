package com.yicheng.reflection;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 18:04
 */
// 反射的基本操作
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象
        Class c1 = Class.forName("com.yicheng.reflection.User");
        System.out.println(c1);

        // Class对象可以有哪些操作
        // 获取该类的所有注解
        c1.getAnnotations();
        // 获取该类的所有方法
        c1.getMethods();
        // 获取该类的所有字段
        c1.getFields();
        // 获取该类的所有构造方法
        c1.getConstructors();

        Class c2 = Class.forName("com.yicheng.reflection.User");
        Class c3 = Class.forName("com.yicheng.reflection.User");
        Class c4 = Class.forName("com.yicheng.reflection.User");
        // 一个类内存中只有一个 Class 对象
        // 一个类被加载后，类的整个结构都会被封装在 Class 对象中
        System.out.println("------------------");
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}
