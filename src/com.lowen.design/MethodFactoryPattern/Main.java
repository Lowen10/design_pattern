package com.lowen.design.MethodFactoryPattern;

import com.lowen.design.MethodFactoryPattern.benz.BenzCarFactory;
import com.lowen.design.MethodFactoryPattern.bmw.BMWCarFactory;

/**
 * 工厂方法模式
 *
 * @Author ：Lowen
 * @Date ：Created in 15:30 23/11/2018
 */
public class Main {

    public static void main(String[] args) {

        //奔驰工厂
        CarFactory carFactory = new BenzCarFactory();
        //创建奔驰轿车
        Car car = carFactory.newCar(BenzCarFactory.SEDAN);
        car.run();
        //创建奔驰SUV
        car = carFactory.newCar(BenzCarFactory.SUV);
        car.run();

        //宝马工厂
        carFactory = new BMWCarFactory();
        //创建奔驰轿车
        car = carFactory.newCar(BMWCarFactory.SEDAN);
        car.run();
        //创建奔驰SUV
        car = carFactory.newCar(BMWCarFactory.SUV);
        car.run();
    }
}
