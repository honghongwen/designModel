package com.europa.design.singleton;

/**
 * 基于懒汉式，有名的双重校验锁 DCL double-checked locking
 */
public class DCLSingleton {

    // volatile防止指令重排序!
    private volatile static DCLSingleton INSTANCE;

    private DCLSingleton() {
    }

    // 直接加锁 粒度太大，优化在于减小锁粒度
    public static DCLSingleton getInstance() {
        if (INSTANCE == null) {
            // 在这里加锁，粒度会更细，但是如果线程阻塞，就会变成线程不安全
            synchronized (DCLSingleton.class) {
                // 再次判断，防止阻塞的线程重复生成实例
                if (INSTANCE == null) {
                    // 这里会发生指令重排序，分配内存、将内存地址指向变量、内存赋值，所以要在上面加上volatile
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
