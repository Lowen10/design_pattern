package com.lowen.design.MethodFactoryPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 16:05 27/11/2018
 * <p>
 * 汽车工厂抽象类
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
