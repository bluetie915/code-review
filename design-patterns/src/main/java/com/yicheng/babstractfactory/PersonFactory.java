package com.yicheng.babstractfactory;

import com.yicheng.babstractfactory.person.American;
import com.yicheng.babstractfactory.person.Chinese;
import com.yicheng.babstractfactory.person.French;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:56
 */
// 人类工厂实现类
public class PersonFactory implements AbstractFactory{
    public Person getPerson(String person) {
        if (person == null)
            return null;
        if (person.equalsIgnoreCase("CHINESE"))
            return new Chinese();
        if (person.equalsIgnoreCase("AMERICAN"))
            return new American();
        if (person.equalsIgnoreCase("FRENCH"))
            return new French();
        return null;
    }

    public Job getJob(String job) {
        return null;
    }
}
