package com.yicheng.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 11:13
 */
// 反射操作注解
public class TestReflectionAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.yicheng.reflection.Doctor");
        // 通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获得注解value的值
        System.out.println("----------------------------");
        TableBlue tableBlue = (TableBlue) c1.getAnnotation(TableBlue.class);
        String value = tableBlue.value();
        System.out.println(value);

        // 获得类指定的注解
        System.out.println("----------------------------");
        Field name = c1.getDeclaredField("id");
        FidleBlue fidleBlue = name.getAnnotation(FidleBlue.class);
        System.out.println(fidleBlue.columnName());
        System.out.println(fidleBlue.length());
        System.out.println(fidleBlue.type());
    }

}

@TableBlue("db_doctor")
class Doctor {
    @FidleBlue(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FidleBlue(columnName = "db_name", type = "varchar", length = 10)
    private String name;
    @FidleBlue(columnName = "db_age", type = "int", length = 10)
    private int age;

    public Doctor() {
    }

    public Doctor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableBlue {
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FidleBlue {
    String columnName();

    String type();

    int length();
}