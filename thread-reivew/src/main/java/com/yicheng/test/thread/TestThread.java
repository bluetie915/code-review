package com.yicheng.test.thread;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 13:02
 */
// 继承父类实现多线程
public class TestThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("通过继承Thread类，我是分支线程，打印" + i);
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("通过继承Thread类，我是主线程，打印" + i);
        }
    }
}
