package com.lowen.design.Singleton;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:23 29/11/2018
 * <p>
 * 线程安全的单例模式
 * <p>
 * 线程安全：否
 * Lazy初始化：是
 */
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton mInstance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (mInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (mInstance == null) {
                    mInstance = new ThreadSafeSingleton();
                }
            }
        }
        return mInstance;
    }
}
