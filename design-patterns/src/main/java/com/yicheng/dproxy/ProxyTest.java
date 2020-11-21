package com.yicheng.dproxy;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 12:13
 */
// 测试代理模式
public class ProxyTest {
    public static void main(String[] args) {
        Programmer you = new Programmer();
        FindLover datingService = new DatingService(you);
        datingService.blindDate();
    }
}
