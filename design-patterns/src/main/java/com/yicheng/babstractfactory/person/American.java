package com.yicheng.babstractfactory.person;

import com.yicheng.babstractfactory.Person;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:29
 */
// 美国人实现类
public class American implements Person {
    public void say() {
        System.out.println("美国人说话：Hello~");
    }
}

