package com.yicheng.fstrategy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 16:47
 */
// 策略启动类
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation() {
        this.strategy.doOperation();
    }
}
