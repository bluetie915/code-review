package com.yicheng.stream;

import java.util.stream.Collectors;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 21:20
 */
// reducing
public class TestStreamReducing {
    public static void main(String[] args) {

        // 分数错误每人多了 10 分，求所有同学正确的分数和
        Integer rightScore = Student.getStudents().stream().collect(Collectors.reducing(0, Student::getScore,
                (param1, param2) -> param1 + param2 - 10));
        System.out.println("reducing() 方法计算所有同学分数减10分的总分数：" + rightScore);
    }
}
