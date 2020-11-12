package com.yicheng.test.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 张艺成
 * @date 2020/11/12 0012 10:38
 */
// 实现callable接口实现多线程
public class TestCallable2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "hello world!";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> ft = new FutureTask<>(new TestCallable2());
        new Thread(ft).start();
        String result = ft.get();
        System.out.println(result);
    }
}
