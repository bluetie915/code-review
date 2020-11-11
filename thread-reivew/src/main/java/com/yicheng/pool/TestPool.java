package com.yicheng.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 16:40
 */
// 测试线程池
public class TestPool {

    public static void main(String[] args) {
        // 1.创建服务，创建线程池
        // 参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        // 2.关闭链接
        service.shutdown();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}