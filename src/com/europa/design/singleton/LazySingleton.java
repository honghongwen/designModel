package com.europa.design.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    // 由于未加锁，在多线程情况下，并不能保证只有一个实例产生
    public static LazySingleton getInstance() {
        // 如果未被初始化，则进行初始化
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
