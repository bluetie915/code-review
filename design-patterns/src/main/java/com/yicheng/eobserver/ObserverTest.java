package com.yicheng.eobserver;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 15:49
 */
// 测试观察者模式
public class ObserverTest {
    public static void main(String[] args) {
        Programmer you = new Programmer();
        // 将两个朋友添加到观察队列里
        new Friend1(you);
        new Friend2(you);

        // 程序员找到对象会通知所有朋友
        you.setHasGirlFirend(true);
    }
}
