package com.lowen.design.AbstractFactoryPattern;

import com.lowen.design.AbstractFactoryPattern.benz.BenzCarFactory;
import com.lowen.design.AbstractFactoryPattern.bmw.BMWCarFactory;
import com.lowen.design.AbstractFactoryPattern.common.Car;
import com.lowen.design.AbstractFactoryPattern.common.CarFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 17:10 27/11/2018
 */
public class Main {

    public static void main(String[] args) {
        //创建宝马汽车
        CarFactory carFactory = new BMWCarFactory();
        Car car = carFactory.newCar(BMWCarFactory.SUV);
        car.run();

        //创建奔驰汽车
        carFactory = new BenzCarFactory();
        car = carFactory.newCar(BenzCarFactory.SUV);
        car.run();
    }
}
