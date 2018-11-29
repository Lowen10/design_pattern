package com.lowen.design.Singleton;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:32 29/11/2018
 * <p>
 * 饿汉式单例模式
 * <p>
 * 线程安全：否
 * Lazy初始化：否
 */
public class HungrySingleton {
    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
