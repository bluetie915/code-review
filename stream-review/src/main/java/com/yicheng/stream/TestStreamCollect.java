package com.yicheng.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 20:02
 */
public class TestStreamCollect {
    public static void main(String[] args) {
        // toList() 将分数大于 90 的学生的信息从流收集到 List 中
        Student.getStudents().stream().filter(stu -> stu.getScore() > 90).collect(Collectors.toList()).forEach(System.out::println);

        // toSet() 将 1，2，3，4，1 收集到 Set 中
        System.out.println("----------------------------------------------");
        Arrays.asList(1, 2, 3, 4, 1).stream().collect(Collectors.toSet()).forEach(System.out::println);

        // toMap() 将所有同学的 List 集合转成流，再收集成 k,v = name,Student 的 map
        System.out.println("----------------------------------------------");
        Student.getStudents().stream().collect(Collectors.toMap(Student::getName, stu -> stu)).entrySet().forEach(System.out::println);
    }
}
