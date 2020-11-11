package com.yicheng.staticproxy;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 16:45
 */
// 真实角色
public class You implements Marry {

    @Override
    public void happyMarry() {
        System.out.println("张老师要结婚了，超开心");
    }
}
