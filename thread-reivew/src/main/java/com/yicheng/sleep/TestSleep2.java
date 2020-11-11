package com.yicheng.sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 9:44
 */
// 模拟网络延时，放大问题的发生性
public class TestSleep2 {

    public static void main(String[] args) {
        // 打印当前系统时间
        Date startTime = new Date(System.currentTimeMillis()); //获取当前系统时间
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());// 更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0)
                break;
        }
    }
}
