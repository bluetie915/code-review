package com.yicheng.lambda;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 17:08
 */
// 原始写法
public class TestLambda {

    // 3.静态内部类
    static class TestInterfaceImpl2 implements TestInterface {
        @Override
        public void getString() {
            System.out.println("I like lamada2，这是在静态内部类里面");
        }
    }

    public static void main(String[] args) {
        TestInterface inter = new TestInterfaceImpl();
        inter.getString();

        inter = new TestInterfaceImpl2();
        inter.getString();

        // 4.局部内部类
        class TestInterfaceImpl3 implements TestInterface {
            @Override
            public void getString() {
                System.out.println("I like lamada3，这是在局部内部类里面");
            }
        }
        inter = new TestInterfaceImpl3();
        inter.getString();

        // 5.匿名内部类 没有类的名称，必须借助接口或者父类
        inter = new TestInterface() {
            @Override
            public void getString() {
                System.out.println("I like lamada4，这是在匿名内部类里面");
            }
        };
        inter.getString();

        // 6.用lambda简化
        inter = () -> System.out.println("I like lamada5，这是使用lambda表达式");
        ;
        inter.getString();
    }
}

// 1.定义一个函数式接口
interface TestInterface {
    void getString();
}

// 2.实现类
class TestInterfaceImpl implements TestInterface {
    @Override
    public void getString() {
        System.out.println("I like lamada1，这是在普通实现类里面");
    }
}