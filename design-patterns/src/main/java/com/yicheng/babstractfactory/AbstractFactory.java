package com.yicheng.babstractfactory;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 10:00
 */
// 顶层抽象工厂接口
public interface AbstractFactory {
    Person getPerson(String person);
    Job getJob(String job);
}
