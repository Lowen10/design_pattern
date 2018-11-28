package com.lowen.design.SimpleFactoryPattern;

/**
 * 简单工厂模式其实不是一种设计模式，只是一种变成习惯
 *
 * @Author ：Lowen
 * @Date ：Created in 15:30 23/11/2018
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Car benzCar = CarFactory.getComputer(CarFactory.Kinds.Benz);
        Car BMWCar = CarFactory.getComputer(CarFactory.Kinds.BMW);

        System.out.println(benzCar.getBrand());
        System.out.println(BMWCar.getBrand());

        //项目中也可能用到这种方式，根据需要选择
        Car benzCar2 = new BenzCar();
        Car BMWCar2 = new BMWCar();

        System.out.println(benzCar2.getBrand());
        System.out.println(BMWCar2.getBrand());
    }
}
