package com.yicheng.stream;

import java.util.stream.Collectors;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 20:33
 */
// groupingBy 根据条件进行分组
public class TestStreamGroupingBy {
    public static void main(String[] args) {
        // 通过 hobby 对 List 进行分组
        Student.getStudents().stream().collect(Collectors.groupingBy(Student::getHobby)).entrySet().forEach(System.out::println);

        // 通过 age 是否大于 20 对 List 进行分组
        System.out.println("-----------------------------------------");
        Student.getStudents().stream().collect(Collectors.partitioningBy(stu -> stu.getAge() > 20)).entrySet().forEach(System.out::println);
    }
}
