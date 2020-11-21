package com.yicheng.babstractfactory.job;

import com.yicheng.babstractfactory.Job;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:53
 */
// 医生实现类
public class Doctor implements Job {
    public void work() {
        System.out.println("医生要治病救人");
    }
}
