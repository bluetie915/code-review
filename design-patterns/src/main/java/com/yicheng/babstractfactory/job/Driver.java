package com.yicheng.babstractfactory.job;

import com.yicheng.babstractfactory.Job;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:54
 */
// 司机实现类
public class Driver implements Job {
    public void work() {
        System.out.println("司机要拉载乘客");
    }
}
