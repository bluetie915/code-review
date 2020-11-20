package com.yicheng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 17:31
 */
// reduce 其实它不是累加，应该说是累计计算，先把前两个根据规则算出结果，可以是累加，累乘，比大小等等
// 再和第 3 个算出结果，依此类推，直到所有元素运算完毕。
// 如果传入第 1 个参数，则先将该参数与第一个元素结合运算
public class TestStreamReduce {
    public static void main(String[] args) {
        // 获取累加的 3 种方式
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        // 方式 1
        Optional<Integer> sum1 = list.stream().reduce((x, y) -> x + y);
        // 方式 2
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);
        // 方式 3
        Integer sum3 = list.stream().reduce(0, Integer::sum);
        System.out.println("reduce() 的求和结果为：" + sum3);


        // 分数求和
        List<Student> students = Student.getStudents();

        Optional<Integer> result1 = students.stream().map(Student::getScore).reduce(Integer::sum);
        Integer result2 = students.stream().reduce(0, (sum, stu) -> sum += stu.getScore(), (param1, param2) -> param1 + param2);
        Integer result3 = students.stream().reduce(0, (sum, stu) -> sum += stu.getScore(), Integer::sum);
        System.out.println("reduce() 的分数求和结果为：" + result3);


        // 分数最大值
        students.stream().reduce(0, (max, stu) -> max > stu.getScore() ? max : stu.getScore(), (param1, param2) -> param1 > param2 ? param1 : param2);
        Integer maxScore = students.stream().reduce(0, (max, stu) -> max > stu.getScore() ? max : stu.getScore(), Integer::max);
        System.out.println("reduce() 的求分数最大值结果为：" + maxScore);
    }
}
