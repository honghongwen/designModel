package com.europa.design.singleton;

/**
 * 单例模式-饿汉式
 */
public class HungrySingleton {

    // 静态常量初始化自身，类加载机制保证了其线程安全
    private static HungrySingleton INSTANCE = new HungrySingleton();

    // 私有化的构造方法
    private HungrySingleton() {
    }

    // 向外提供获取实例的方法
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
