package com.europa.design.singleton;

/**
 * 静态内部类
 */
public class InnerSingleton {

    private InnerSingleton() {}

    public static InnerSingleton getInstance() {
        return InnerSingletonHolder.INSTANCE;
    }

    private static class InnerSingletonHolder {
        private static InnerSingleton INSTANCE = new InnerSingleton();
    }
}
