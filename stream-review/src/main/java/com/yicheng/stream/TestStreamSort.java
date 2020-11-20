package com.yicheng.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 21:44
 */
public class TestStreamSort {
    public static void main(String[] args) {
        System.out.println("按分数升序排序：");
        Student.getStudents().stream().sorted(Comparator.comparing(Student::getScore)).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        System.out.println("按分数降序排序：");
        Student.getStudents().stream().sorted(Comparator.comparing(Student::getScore).reversed()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        System.out.println("先按分数再按年龄年龄排序：");
        Student.getStudents().stream().sorted(Comparator.comparing(Student::getScore).thenComparing(Student::getAge)).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        System.out.println("先按分数再按年龄自定义降序排序：");
        Student.getStudents().stream().sorted((stu1, stu2) -> {
            if (stu1.getScore() == stu2.getScore())
                return stu2.getAge() - stu1.getAge();
            return stu1.getScore() - stu2.getScore();
        }).forEach(System.out::println);
    }
}
