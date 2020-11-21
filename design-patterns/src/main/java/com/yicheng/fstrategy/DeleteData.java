package com.yicheng.fstrategy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 16:45
 */
// 策略实现类 3
public class DeleteData implements Strategy{
    public void doOperation() {
        System.out.println("压力太大，删库跑路~");
    }
}
