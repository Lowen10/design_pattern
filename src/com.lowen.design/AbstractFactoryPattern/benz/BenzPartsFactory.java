package com.lowen.design.AbstractFactoryPattern.benz;

import com.lowen.design.AbstractFactoryPattern.common.PartsFactory;
import com.lowen.design.AbstractFactoryPattern.common.parts.Body;
import com.lowen.design.AbstractFactoryPattern.common.parts.Chassis;
import com.lowen.design.AbstractFactoryPattern.common.parts.Electrical;
import com.lowen.design.AbstractFactoryPattern.common.parts.Engine;

/**
 * @Author ：Lowen
 * @Date ：Created in 14:06 28/11/2018
 */
public class BenzPartsFactory implements PartsFactory {
    @Override
    public Body body() {
        return new BenzBody();
    }

    @Override
    public Electrical electrical() {
        return new BenzElectrical();
    }

    @Override
    public Chassis chassis() {
        return new BenzChassis();
    }

    @Override
    public Engine engine() {
        return new BenzEngine();
    }
}
