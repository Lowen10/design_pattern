package com.lowen.design.SimpleFactoryPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:30 23/11/2018
 */
public class CarFactory {

    public enum Kinds {
        Benz, BMW
    }

    public static Car getComputer(Kinds kinds) {
        switch (kinds) {
            case BMW:
                return new BMWCar();
            case Benz:
                return new BenzCar();
        }
        return null;
    }

}
