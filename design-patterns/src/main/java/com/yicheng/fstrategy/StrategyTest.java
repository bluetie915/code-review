package com.yicheng.fstrategy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 16:49
 */
// 测试策略模式
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new LowKey());
        // 执行第一个策略
        context.doOperation();

        // 执行第二个策略
        context = new Context(new WorkCrazy());
        context.doOperation();

        // 执行第三个策略
        context = new Context(new DeleteData());
        context.doOperation();
    }
}
