package com.yicheng.eobserver;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 15:23
 */
// 朋友 1 作为观察者
public class Friend1 extends Observer{

    public Friend1(Programmer programmer) {
        this.programmer = programmer;
        this.programmer.attach(this);
    }

    void knowMsg() {
        System.out.println("说好的一起代码到终老，你怎么能这样~");
    }
}
