package com.yicheng.join;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 10:01
 */
// 测试join方法
// 想象为插队
public class TestJoin implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("线程vip来了....");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 启动我们的线程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i < 500; i++) {
            if (i == 200)
                thread.join();
            System.out.println("main..." + i);
        }
    }
}
