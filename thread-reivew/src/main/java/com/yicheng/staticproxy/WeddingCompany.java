package com.yicheng.staticproxy;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 16:46
 */
// 代理角色，帮助你结婚
public class WeddingCompany implements Marry {

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        beforeMarry();
        this.target.happyMarry();
        afterMarry();
    }

    private void afterMarry() {
        System.out.println("恭喜两位新人...");
    }

    private void beforeMarry() {
        System.out.println("布置结婚场地...");
    }
}
