package com.yicheng.stream;

import java.util.stream.Collectors;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 20:27
 */
// join 拼接字符串
public class TestStreamJoining {
    public static void main(String[] args) {
        // 将所有同学的名字用 , 隔开
        System.out.println(Student.getStudents().stream().map(Student::getName).collect(Collectors.joining(",")));
        // 将所有同学的名字用 , 隔开，并用 [ 当前缀，用 ] 当后缀
        System.out.println(Student.getStudents().stream().map(Student::getName).collect(Collectors.joining(",","[","]")));
    }
}
