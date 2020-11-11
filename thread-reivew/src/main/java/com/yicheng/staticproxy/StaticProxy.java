package com.yicheng.staticproxy;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 16:43
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 静态代理模式
 * 1.真实对象和代理对象都要实现同一个接口
 * 2.代理对象要代理真实角色
 * 3.代理对象可以做很多真实对象做不了的事情
 * 4.真实对象专注做自己的事情
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
        new Thread(() -> System.out.println("zhangsan")).start();
    }
}
