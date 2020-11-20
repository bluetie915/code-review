package com.yicheng.stream;

import java.util.stream.Stream;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 23:07
 */
public class TestStreamConcatLimitSkipDistinct {
    public static void main(String[] args) {
        Stream<Student> stream1 = Student.getStudents().stream().filter(stu -> stu.getAge() > 23);
        Stream<Student> stream2 = Student.getStudents().stream().filter(stu -> stu.getScore() > 90);

        System.out.println("--------------使用 concat 连接流，使用 distinct 去重----------------");
        Stream.concat(stream1, stream2).distinct().forEach(System.out::println);

        System.out.println("---------------------使用 limit 限定只要前几个----------------------");
        Student.getStudents().stream().limit(3).forEach(System.out::println);

        System.out.println("---------------------使用 skip 跳过指定个数-----------------------");
        Student.getStudents().stream().skip(3).forEach(System.out::println);
    }
}
