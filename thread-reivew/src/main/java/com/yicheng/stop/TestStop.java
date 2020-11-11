package com.yicheng.stop;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 9:34
 */
// 不推荐使用JDK提供的stop()和destroy()方法
// 推荐线程自己停止下来
public class TestStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run...thread..." + i++);
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main---" + i);
            if (i == 900) {
                testStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}
