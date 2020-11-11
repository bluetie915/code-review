package com.yicheng.deadlock;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 14:24
 */
// 死锁：多个线程互相抱着对方需要的资源，然后形成僵持
public class TestDeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");

        g1.start();
        g2.start();
    }
}

class Makeup extends Thread {

    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice; // 选择
    String girlName; // 使用化妆品的人

    Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        // 化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 化妆，互相持有对方的锁，就是需要拿到对方的资源
    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipstick) { // 获取口红的锁
                System.out.println(this.girlName + "获取口红的锁");
                Thread.sleep(1000);
                synchronized (mirror) { // 一秒钟后想获得镜子
                    System.out.println(this.girlName + "想获得镜子的锁");
                }
            }
        }else {
            synchronized (mirror) { // 获取镜子的锁
                System.out.println(this.girlName + "获取镜子的锁");
                Thread.sleep(1000);
                synchronized (lipstick) { // 一秒钟后想获取口红
                    System.out.println(this.girlName + "想获得口红的锁");
                }
            }
        }
    }
}

// 口红
class Lipstick {

}

// 镜子
class Mirror {

}
