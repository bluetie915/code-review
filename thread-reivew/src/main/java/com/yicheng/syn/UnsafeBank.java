package com.yicheng.syn;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 13:20
 */
public class UnsafeBank {

    public static void main(String[] args) {
        Account account = new Account(100, "建设银行");

        Drawing you = new Drawing(account, 50, "你");
        Drawing wife = new Drawing(account, 100, "wife");
        you.start();
        wife.start();
    }
}

// 帐户
class Account {
    int money; // 余额
    String name;  // 卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

// 银行：模拟取款
class Drawing extends Thread {

    // 帐户
    Account account;
    // 取了多少钱
    int drawingMoney;
    // 现在手里多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        synchronized (account) {
            // 判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "要取钱，钱不够取不了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getName() + "要取" + drawingMoney + "元钱，此时余额为" + account.money);
            // 卡内余额 = 余额 - 你取的钱
            account.money = account.money - drawingMoney;
            // 你手里的钱
            nowMoney = nowMoney + drawingMoney;
            System.out.println(this.getName() + "取钱结束，此时" + account.name + "余额为：" + account.money);
            System.out.println(this.getName() + "手里的钱：" + nowMoney);
        }
    }
}