package com.yicheng.babstractfactory.job;

import com.yicheng.babstractfactory.Job;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:54
 */
// 老师实现类
public class Teacher implements Job {
    public void work() {
        System.out.println("老师要教育孩子");
    }
}


