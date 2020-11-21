package com.yicheng.babstractfactory;

import com.yicheng.babstractfactory.job.Doctor;
import com.yicheng.babstractfactory.job.Driver;
import com.yicheng.babstractfactory.job.Teacher;
import com.yicheng.babstractfactory.person.American;
import com.yicheng.babstractfactory.person.Chinese;
import com.yicheng.babstractfactory.person.French;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:56
 */
// 工作工厂实现类
public class JobFactory implements AbstractFactory{
    public Person getPerson(String person) {
        return null;
    }

    public Job getJob(String job) {
        if (job == null)
            return null;
        if (job.equalsIgnoreCase("DOCTOR"))
            return new Doctor();
        if (job.equalsIgnoreCase("TEACHER"))
            return new Teacher();
        if (job.equalsIgnoreCase("DRIVER"))
            return new Driver();
        return null;
    }
}
