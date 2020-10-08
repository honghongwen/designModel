package com.europa.design.singleton;

/**
 * 一般来讲，直接使用饿汉式。除非指明要懒加载，才会使用静态内部类的方式，如有特殊要求，使用DCL。涉及到反射、使用Enum
 */
public class Test {

    public static void main(String[] args) {
//        // 证明懒汉式非线程安全
//        for (int i = 0; i < 10000; i++) {
//            new Thread(() -> System.out.println(LazySingleton.getInstance().hashCode())).start();
//        }
//
//        // 证明饿汉式是线程安全
//        for (int i = 0; i < 10000; i++) {
//            new Thread(() -> System.out.println(HungrySingleton.getInstance().hashCode())).start();
//        }

//        // 证明双重校验锁是线程安全，但是未测试出发生指令重排序
//        for (int i = 0; i < 100000; i++) {
//            new Thread(() -> System.out.println(DCLSingleton.getInstance().hashCode())).start();
//        }

        // 证明双重校验锁是线程安全的
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(InnerSingleton.getInstance().hashCode())).start();
        }

    }
}
