package com.lowen.design.Singleton;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:23 29/11/2018
 * <p>
 * 懒汉式单例模式
 * <p>
 * 线程安全：否
 * Lazy初始化：是
 */
public class LazySingleton {
    private static LazySingleton mInstance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (mInstance == null) {
            mInstance = new LazySingleton();
        }
        return mInstance;
    }
}
