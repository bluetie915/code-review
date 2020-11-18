package com.yicheng.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 15:11
 */
// filter 筛选符合规则的对象
// forEach 遍历流中的对象
// collect 收集流中的内容
public class TestStreamFilter {
    public static void main(String[] args) {
        List<Student> list = Student.getStudents();
        list.stream().filter(stu -> stu.getAge() > 20).forEach(System.out::println);

        // 将 stream() 收集成集合
        List<Student> newList = list.stream().filter(stu -> stu.getAge() > 20).collect(Collectors.toList());
        System.out.println("--------------------------------");
        System.out.println(newList);
    }
}
