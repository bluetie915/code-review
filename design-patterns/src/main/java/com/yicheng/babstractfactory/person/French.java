package com.yicheng.babstractfactory.person;

import com.yicheng.babstractfactory.Person;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:30
 */
// 法国人实现类
public class French implements Person {
    public void say() {
        System.out.println("法国人说话：bonjour~");
    }
}
