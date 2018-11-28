package com.lowen.design.AbstractFactoryPattern.benz;

import com.lowen.design.AbstractFactoryPattern.common.parts.Chassis;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:22 28/11/2018
 */
public class BenzChassis implements Chassis {
    @Override
    public String description() {
        return "Benz Chassis";
    }
}
