package com.yicheng.afactory;

import com.yicheng.afactory.person.American;
import com.yicheng.afactory.person.Chinese;
import com.yicheng.afactory.person.French;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:33
 */
// 测试工厂模式
public class FactoryTest {

    public static void main(String[] args) {
        Chinese chinese = (Chinese) PersonFactory.getPerson("chinese");
        chinese.say();

        French french = (French) PersonFactory.getPerson("french");
        french.say();

        American american = (American) PersonFactory.getPerson("american");
        american.say();
    }
}
