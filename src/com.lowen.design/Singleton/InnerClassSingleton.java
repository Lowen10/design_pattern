package com.lowen.design.Singleton;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:37 29/11/2018
 * <p>
 * 登记式/静态内部类单例模式
 * <p>
 * 线程安全：是
 * Lazy初始化：是
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
