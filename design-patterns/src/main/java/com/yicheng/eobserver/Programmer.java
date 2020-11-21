package com.yicheng.eobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 14:52
 */
// 程序员（被观察者）
public class Programmer {
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean hasGirlFirend;

    public boolean isHasGirlFirend() {
        return hasGirlFirend;
    }

    public void setHasGirlFirend(boolean hasGirlFirend) {
        this.hasGirlFirend = hasGirlFirend;
        if (hasGirlFirend == true)
            notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.knowMsg();
        }
    }
}
