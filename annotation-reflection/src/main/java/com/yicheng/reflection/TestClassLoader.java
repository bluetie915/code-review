package com.yicheng.reflection;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 9:00
 */
public class TestClassLoader {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }
    static int m = 100;

    public A() {
        System.out.println("A类的无参构造初始化");
    }
}
