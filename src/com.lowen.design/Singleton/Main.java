package com.lowen.design.Singleton;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:41 29/11/2018
 */
public class Main {

    public static void main(String[] args) {
        HungrySingleton.getInstance();
        InnerClassSingleton.getInstance();
        LazySingleton.getInstance();
        ThreadSafeSingleton.getInstance();
    }
}
