package com.lowen.design.MethodFactoryPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:24 23/11/2018
 * <p>
 * 汽车基类
 */
public abstract class Car {

    protected String brand;

    void prepare() {
        System.out.println("=== Start create a " + brand + " Car ===");
    }

    void chassis() {
        System.out.println("Creating chassis.");
    }

    void body() {
        System.out.println("Creating body.");
    }

    void engine() {
        System.out.println("Creating engine.");
    }

    void electrical() {
        System.out.println("Creating electrical.");
    }

    void finish() {
        System.out.println("=== The birth of a new " + brand + "Car ===");
    }

    public void run() {
        System.out.println("Hello, I'm a new " + brand + " Car.");
        System.out.println();
    }
}
