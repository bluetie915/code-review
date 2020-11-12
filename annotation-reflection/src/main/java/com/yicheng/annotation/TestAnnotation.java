package com.yicheng.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 16:07
 */
// 什么注解
public class TestAnnotation extends Object{

    @Override
    public String toString() {
        return super.toString();
    }

    // 不推荐使用，但是可以使用，或者推荐更好的方式
    @Deprecated
    public static void test01() {
        System.out.println("this is a test");
    }

    @SuppressWarnings("all")
    public void test02() {
        List<String> list = new ArrayList<String>();
    }

    public static void main(String[] args) {
        test01();
    }
}
