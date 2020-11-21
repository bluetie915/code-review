package com.yicheng.babstractfactory;


import com.yicheng.babstractfactory.job.Doctor;
import com.yicheng.babstractfactory.person.Chinese;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 10:01
 */
// 测试抽象工厂模式
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory personFactory = new PersonFactory();
        Chinese chinese = (Chinese) personFactory.getPerson("chinese");
        chinese.say();

        AbstractFactory jobFactory = new JobFactory();
        Doctor doctor = (Doctor) jobFactory.getJob("doctor");
        doctor.work();
    }
}
