package com.lowen.design.AbstractFactoryPattern.common;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:28 28/11/2018
 * <p>
 * 汽车工厂基类
 */
public abstract class CarFactory {

    protected abstract Car createCar(String item);

    public Car newCar(String item) {
        Car car = createCar(item);
        car.prepare();
        car.chassis();
        car.body();
        car.engine();
        car.electrical();
        car.finish();
        return car;
    }

}
