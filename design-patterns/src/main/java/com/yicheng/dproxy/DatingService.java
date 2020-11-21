package com.yicheng.dproxy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 12:02
 */
// 婚介所实现找对象接口（代理者）
public class DatingService implements FindLover{
    private Programmer programmer;

    public DatingService(Programmer programmer) {
        this.programmer = programmer;
    }

    public void blindDate() {
        beforeBlindDate();
        this.programmer.blindDate();
        afterBlindDate();
    }

    public void beforeBlindDate() {
        System.out.println("不敢迈出第一步，还是找婚介所帮忙吧");
    }

    public void afterBlindDate() {
        System.out.println("我一个35的程序员居然还能找到对象，我何德何能...");
    }
}
