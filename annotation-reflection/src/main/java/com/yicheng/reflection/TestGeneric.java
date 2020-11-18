package com.yicheng.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author 张艺成
 * @date 2020/11/13 0013 11:00
 */
// 通过反射获取泛型
public class TestGeneric {
    public void test01(Map<Integer, User> map, List<User> list) {
        System.out.println("test01");
    }

    public Map<String, User> test02() {
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {

        // 参数泛型
        // 获取方法 test01
        Method method = TestGeneric.class.getMethod("test01", Map.class, List.class);
        // 找到该方法所有带泛型的参数
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            // 打印该参数的泛型所有泛型类型
            System.out.println("带泛型的参数：" + genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                // 对该参数的所有泛型类型进行遍历
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("参数的具体类型：" + actualTypeArgument);
                }
            }
        }

        // 返回值泛型
        System.out.println("------------------------------");
        Method method2 = TestGeneric.class.getMethod("test02", null);
        Type genericReturnType = method2.getGenericReturnType();
        System.out.println("带泛型的返回值：" + genericReturnType);
        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("返回值的具体类型：" + actualTypeArgument);
            }
        }
    }
}
