package com.yicheng.operateobject;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 15:38
 */
// 多个线程同时操作一个对象，例如购买火车票
// 多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TestThread implements Runnable {

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
        TestThread testThread = new TestThread();
        new Thread(testThread, "小明").start();
        new Thread(testThread, "老师").start();
        new Thread(testThread, "黄牛").start();

    }
}
