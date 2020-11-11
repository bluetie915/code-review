package com.yicheng.sleep;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 9:44
 */
// 模拟网络延时，放大问题的发生性
public class TestSleep implements Runnable {

    private int ticketNums = 30;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0)
                break;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }
    }

    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();
        new Thread(testSleep, "小明").start();
        new Thread(testSleep, "老师").start();
        new Thread(testSleep, "黄牛").start();

    }
}
