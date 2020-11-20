package com.yicheng.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 14:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private String hobby;
    private Integer score;

    public static List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 24, "basketball", 88));
        list.add(new Student("李四", 15, "baseball", 78));
        list.add(new Student("王五", 30, "soccer", 80));
        list.add(new Student("赵六", 18, "soccer", 80));
        list.add(new Student("李刚", 22, "basketball", 78));
        list.add(new Student("小明", 25, "run", 100));
        return list;
    }
}
