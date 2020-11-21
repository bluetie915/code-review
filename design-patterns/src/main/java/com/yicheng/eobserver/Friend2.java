package com.yicheng.eobserver;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 15:48
 */
// 朋友 2 作为观察者
public class Friend2 extends Observer{

    public Friend2(Programmer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }

    void knowMsg() {
        System.out.println("你再也不是爸爸的好儿子了，耗子为汁~");
    }
}
