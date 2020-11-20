package com.yicheng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 16:23
 */
public class TestStreamMap {

    public static void main(String[] args) {

        // 获取年龄大于 23 的同学
        List<Student> list = Student.getStudents().stream().filter(stu -> stu.getAge() > 23).collect(Collectors.toList());
        // 遍历该 list
        list.forEach(System.out::println);

        System.out.println("----------------------所有同学年龄加1-------------------------");
        // 让该 list 中的所有同学年龄加 1
        list.stream().map(stu -> {
            stu.setAge(stu.getAge() + 1);
            return stu;
        }).collect(Collectors.toList()).forEach(System.out::println);

        // flatMap 将两个 list 合一
        System.out.println("----------------------flatMap将两个list合一-------------------------");
        List<Student> list2 = Student.getStudents().stream().filter(stu -> stu.getAge() > 23).collect(Collectors.toList());
        List<List<Student>> nowList = Arrays.asList(list, list2);
        nowList.stream().flatMap(stus -> {
            Stream<Student> stream = stus.stream();
            return stream;
        }).forEach(System.out::println);
    }
}
