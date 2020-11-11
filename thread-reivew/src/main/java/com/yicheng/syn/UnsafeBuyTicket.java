package com.yicheng.syn;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 10:44
 */
// 不安全的买票
// 线程不安全，有负数
public class UnsafeBuyTicket {

    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();
        new Thread(station, "苦逼的我").start();
        new Thread(station, "厉害的你们").start();
        new Thread(station, "可恶的黄牛").start();
    }
}

class BuyTicket implements Runnable {

    // 票
    private int ticketNum = 10;
    // 外部停止方式
    private boolean flag = true;

    @Override
    public void run() {
        // 买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // synchronized 同步方法
    public synchronized void buy() throws InterruptedException {
        // 判断是否有票
        if (ticketNum <= 0) {
            flag = false;
            return;
        }
        // 模拟延时
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "-->拿到第" + ticketNum-- + "张票");
    }
}
