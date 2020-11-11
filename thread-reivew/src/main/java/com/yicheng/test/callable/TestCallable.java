package com.yicheng.test.callable;

import java.util.concurrent.*;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 16:11
 */
// 实现callable接口实现多线程
/**
 * 1.可以定义返回值
 * 2.可以抛出异常
 */
public class TestCallable implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable testCallable1 = new TestCallable();
        TestCallable testCallable2 = new TestCallable();
        TestCallable testCallable3 = new TestCallable();

        // 创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> r1 = service.submit(testCallable1);
        Future<Boolean> r2 = service.submit(testCallable2);
        Future<Boolean> r3 = service.submit(testCallable3);
        // 获取结果
        String result1 = "结果1：" + r1.get();
        String result2 = "结果2：" + r2.get();
        String result3 = "结果3：" + r3.get();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        // 关闭服务
        service.shutdown();
    }
}
