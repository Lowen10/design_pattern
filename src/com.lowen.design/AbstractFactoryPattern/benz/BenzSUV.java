package com.lowen.design.AbstractFactoryPattern.benz;


import com.lowen.design.AbstractFactoryPattern.common.Car;
import com.lowen.design.AbstractFactoryPattern.common.PartsFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:25 23/11/2018
 * <p>
 * Benz SUV，继承汽车基类
 */
public class BenzSUV extends Car {

    public BenzSUV(PartsFactory partsFactory) {
        brand = "Benz SUV";
        body = partsFactory.body();
        chassis = partsFactory.chassis();
        engine = partsFactory.engine();
        electrical = partsFactory.electrical();
    }
}
