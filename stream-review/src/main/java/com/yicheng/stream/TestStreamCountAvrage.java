package com.yicheng.stream;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 20:45
 */
public class TestStreamCountAvrage {
    public static void main(String[] args) {

        // 计算学生的总数
        Long count = Student.getStudents().stream().collect(Collectors.counting());
        System.out.println("counting() 方法计算的总数为：" + count);

        // 计算学生平均分数
        Double averageScore = Student.getStudents().stream().collect(Collectors.averagingLong(Student::getScore));
        System.out.println("averagingLong() 方法计算的平均分为：" + averageScore);

        // 计算年龄最大的学生
        Optional<Integer> maxAge = Student.getStudents().stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compareTo));
        System.out.println("maxBy() 方法计算的最大年龄为：" + maxAge.get());

        // 计算所有同学的分数和
        Integer sumScore = Student.getStudents().stream().collect(Collectors.summingInt(Student::getScore));
        System.out.println("summingInt() 方法计算所有学生分数和为：" + sumScore);

        // 统计同学关于分数的所有信息
        DoubleSummaryStatistics collect = Student.getStudents().stream().collect(Collectors.summarizingDouble(Student::getScore));
        System.out.println("summarizingDouble() 统计关于分数的信息：" + collect);
    }
}
