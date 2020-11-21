package com.yicheng.fstrategy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 16:44
 */
// 策略实现类 1
public class LowKey implements Strategy{
    public void doOperation() {
        System.out.println("刚入职要低调做事~");
    }
}
