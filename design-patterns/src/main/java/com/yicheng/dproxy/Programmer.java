package com.yicheng.dproxy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 12:07
 */
// 程序员实现找对象接口（被代理者）
public class Programmer implements FindLover{
    public void blindDate() {
        System.out.println("卑微程序员相亲找对象");
    }
}

