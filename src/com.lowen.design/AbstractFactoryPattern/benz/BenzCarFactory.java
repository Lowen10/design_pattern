package com.lowen.design.AbstractFactoryPattern.benz;

import com.lowen.design.AbstractFactoryPattern.common.Car;
import com.lowen.design.AbstractFactoryPattern.common.CarFactory;
import com.lowen.design.AbstractFactoryPattern.common.PartsFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:39 28/11/2018
 */
public class BenzCarFactory extends CarFactory {

    public static final String SEDAN = "sedan";
    public static final String SUV = "suv";

    @Override
    protected Car createCar(String item) {
        PartsFactory partsFactory;
        Car car = null;
        if (SUV.equals(item)) {
            partsFactory = new BenzPartsFactory();
            car = new BenzSUV(partsFactory);
        } else if (SEDAN.equals(item)) {
            //如果需要扩展，可继续创建相关的PartsFactory和Parts
        }
        return car;
    }
}
