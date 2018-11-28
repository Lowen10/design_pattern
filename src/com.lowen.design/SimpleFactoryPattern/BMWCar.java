package com.lowen.design.SimpleFactoryPattern;

/**
 * @Author     ：Lowen
 * @Date       ：Created in 15:29 23/11/2018
 */
public class BMWCar implements Car {

    @Override
    public String getBrand() {
        return "I'm BMW.";
    }
}
