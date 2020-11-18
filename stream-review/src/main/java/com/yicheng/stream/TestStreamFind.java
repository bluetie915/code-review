package com.yicheng.stream;

import java.util.List;
import java.util.Optional;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 14:42
 */
// find 找到匹配规则的对象
// match 是否存在匹配规则对象
public class TestStreamFind {
    public static void main(String[] args) {

        List<Student> students = Student.getStudents();
        // findFirst() 找到符合标准的第一个
        Optional<Student> first = students.stream().filter(stu -> stu.getAge() > 22).findFirst();
        System.out.println("findFist() 找到第一个匹配对象：" + first.get());

        // findAny() 找到符合标准的随机一个，一般用于并行流中
        Optional<Student> any = students.stream().filter(stu -> stu.getScore() > 90).findAny();
        System.out.println("-------------------------------------");
        System.out.println("findAny() 找到随机一个匹配对象：" + any.get());

        // aynMatch() 是否存在匹配对象
        boolean result = students.stream().anyMatch(stu -> stu.getScore() < 50);
        System.out.println("-------------------------------------");
        System.out.println("anyMatch() 返回是否存在匹配对象：" + result);
    }
}
