package com.yicheng.babstractfactory.person;

import com.yicheng.babstractfactory.Person;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:26
 */
// 中国人实现类
public class Chinese implements Person {
    public void say() {
        System.out.println("中国人说话：你好~");
    }
}
