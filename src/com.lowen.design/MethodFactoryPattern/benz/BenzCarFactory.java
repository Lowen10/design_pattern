package com.lowen.design.MethodFactoryPattern.benz;

import com.lowen.design.MethodFactoryPattern.Car;
import com.lowen.design.MethodFactoryPattern.CarFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 16:11 27/11/2018
 * <p>
 * Benz 汽车工厂，继承汽车工厂抽象类
 */
public class BenzCarFactory extends CarFactory {

    public static final String SEDAN = "sedan";
    public static final String SUV = "suv";

    @Override
    protected Car createCar(String item) {
        Car car = null;
        if (SEDAN.equals(item)) {
            car = new BenzSedan();
        } else if (SUV.equals(item)) {
            car = new BenzSUV();
        }
        return car;
    }

}
