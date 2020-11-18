package com.yicheng.reflection;

/**
 * @author 张艺成
 * @date 2020/11/15 0015 0:36
 */
// 类加载顺序
public class TestClassLoader2 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    public static int i = 10;
    private int j = 15;

    static {
        System.out.println("parent 静态代码块，无静态变量");
    }

    static {
        i = i + 100;
        System.out.println("parent 静态代码块，有静态变量,i = " + i);
    }

    {
        System.out.println("parent 代码块，无静态变量");
    }

    {
        j = j + 200;
        System.out.println("parent 代码块，有静态变量，j = " + j);
    }

    public Parent() {
        System.out.println("parent 构造方法");
    }

}

class Child extends Parent {
    public static int m = 26;
    private int n = 37;

    static {
        System.out.println("child 静态代码块，无静态变量");
    }

    static {
        m = m + 300;
        System.out.println("child 静态代码块，有静态变量,m = " + m);
    }

    {
        System.out.println("child 代码块，无静态变量");
    }

    {
        n = n + 400;
        System.out.println("child 代码块，有静态变量, n = " + n);
    }

    public Child() {
        System.out.println("child 构造方法");
    }
}