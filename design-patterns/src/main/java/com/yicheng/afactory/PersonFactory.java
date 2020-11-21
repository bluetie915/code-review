package com.yicheng.afactory;

import com.yicheng.afactory.person.American;
import com.yicheng.afactory.person.Chinese;
import com.yicheng.afactory.person.French;

/**
 * @author 张艺成
 * @date 2020/11/20 0020 9:31
 */
// 人类工厂
public class PersonFactory {
    public static Person getPerson(String person) {
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
}
