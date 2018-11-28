package com.lowen.design.AbstractFactoryPattern.bmw;

import com.lowen.design.AbstractFactoryPattern.common.parts.Engine;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:21 28/11/2018
 */
public class BMWEngine implements Engine {
    @Override
    public String description() {
        return "BMW Engine";
    }
}
