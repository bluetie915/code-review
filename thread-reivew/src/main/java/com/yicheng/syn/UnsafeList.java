package com.yicheng.syn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 13:38
 */
// 线程不安全的集合
public class UnsafeList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
