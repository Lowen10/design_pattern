package com.lowen.design.MethodFactoryPattern.bmw;

import com.lowen.design.MethodFactoryPattern.Car;
import com.lowen.design.MethodFactoryPattern.CarFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 16:11 27/11/2018
 * <p>
 * BMW 汽车工厂，继承汽车工厂抽象类
 */
public class BMWCarFactory extends CarFactory {

    public static final String SEDAN = "sedan";
    public static final String SUV = "suv";

    @Override
    protected Car createCar(String item) {
        Car car = null;
        if (SEDAN.equals(item)) {
            car = new BMWSedan();
        } else if (SUV.equals(item)) {
            car = new BMWSUV();
        }
        return car;
    }

}
