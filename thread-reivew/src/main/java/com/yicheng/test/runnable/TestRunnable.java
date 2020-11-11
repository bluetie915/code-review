package com.yicheng.test.runnable;

import com.yicheng.test.thread.TestThread;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 15:26
 */
// 实现接口实现多线程
public class TestRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("我是分支线程，打印" + i);
        }
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        // 通过线程对象来开启线程，代理
        new Thread(testRunnable).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我是主线程，打印" + i);
        }
    }
}
