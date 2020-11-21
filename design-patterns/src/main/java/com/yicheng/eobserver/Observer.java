package com.yicheng.eobserver;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 15:16
 */
// 观察者抽象类
public abstract class Observer {
    protected Programmer programmer;
    abstract void knowMsg();
}
