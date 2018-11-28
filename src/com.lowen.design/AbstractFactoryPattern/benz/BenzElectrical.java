package com.lowen.design.AbstractFactoryPattern.benz;

import com.lowen.design.AbstractFactoryPattern.common.parts.Electrical;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:23 28/11/2018
 */
public class BenzElectrical implements Electrical {
    @Override
    public String description() {
        return "Benz Electrical";
    }
}
