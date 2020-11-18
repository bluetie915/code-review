package com.yicheng.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 15:24
 */
// max 找到符合规则的最大值
// min 找到符合规则的最大值
// count 找到符合规则的个数
public class TestStreamMinMaxCount {
    public static void main(String[] args) {
        List<Student> list = Student.getStudents();

        Optional<Student> max = list.stream().max(Comparator.comparing(Student::getAge));
        System.out.println("max() 找到的年龄最大的对象：" + max.get());

        Optional<Student> min = list.stream().min(Comparator.comparing(Student::getScore));
        System.out.println("min() 找到的分数最小的对象：" + max.get());

        long count = list.stream().filter(stu -> stu.getScore() > 90).count();
        System.out.println("count() 找到分数在90分以上的对象的个数：" + count);
    }
}
