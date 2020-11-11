package com.yicheng.state;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 10:07
 */
// 观察测试线程的状态，线程中断或者结束之后不能再次开始
public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("---------------");
        });

        // 观察状态
        Thread.State state = thread.getState();

        // NEW
        System.out.println(state);
        // 观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);

        // 只要线程不终止，就一起输出状态
        while (state != Thread.State.TERMINATED) {
            Thread.sleep(100);
            // 更新线程状态
            state = thread.getState();
            // 输出状态
            System.out.println(state);
        }
    }
}
