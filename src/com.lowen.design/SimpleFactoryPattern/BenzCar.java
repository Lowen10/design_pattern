package com.lowen.design.SimpleFactoryPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:25 23/11/2018
 */
public class BenzCar implements Car {

    @Override
    public String getBrand() {
        return "I'm Benz.";
    }
}
