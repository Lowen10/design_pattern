package com.lowen.design.AbstractFactoryPattern.bmw;


import com.lowen.design.AbstractFactoryPattern.common.Car;
import com.lowen.design.AbstractFactoryPattern.common.PartsFactory;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:25 23/11/2018
 * <p>
 * BMW SUV，继承汽车基类
 */
public class BMWSUV extends Car {

    public BMWSUV(PartsFactory partsFactory) {
        brand = "BMW SUV";
        body = partsFactory.body();
        chassis = partsFactory.chassis();
        engine = partsFactory.engine();
        electrical = partsFactory.electrical();
    }
}
