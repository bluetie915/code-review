package com.yicheng.reflection;

import java.lang.reflect.Field;

/**
 * @author 张艺成
 * @date 2020/11/15 0015 1:18
 */
// Class 操作属性
public class TestClassOperateField {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("com.yicheng.reflection.User");

        // 通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 不能直接操作私有属性，需要关打开修改权限，属性或者方法的 setAccessible(true)
        name.setAccessible(true);
        name.set(user4, "王二");
        System.out.println(user4);
    }
}
