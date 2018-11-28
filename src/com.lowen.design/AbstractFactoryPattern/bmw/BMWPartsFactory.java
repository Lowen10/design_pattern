package com.lowen.design.AbstractFactoryPattern.bmw;

import com.lowen.design.AbstractFactoryPattern.common.PartsFactory;
import com.lowen.design.AbstractFactoryPattern.common.parts.Body;
import com.lowen.design.AbstractFactoryPattern.common.parts.Chassis;
import com.lowen.design.AbstractFactoryPattern.common.parts.Electrical;
import com.lowen.design.AbstractFactoryPattern.common.parts.Engine;

/**
 * @Author ：Lowen
 * @Date ：Created in 14:07 28/11/2018
 */
public class BMWPartsFactory implements PartsFactory {
    
    @Override
    public Body body() {
        return new BMWBody();
    }

    @Override
    public Electrical electrical() {
        return new BMWElectrical();
    }

    @Override
    public Chassis chassis() {
        return new BMWChassis();
    }

    @Override
    public Engine engine() {
        return new BMWEngine();
    }
}
