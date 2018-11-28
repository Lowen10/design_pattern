package com.lowen.design.AbstractFactoryPattern.bmw;

import com.lowen.design.AbstractFactoryPattern.common.parts.Body;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:20 28/11/2018
 */
public class BMWBody implements Body {
    @Override
    public String description() {
        return "BMW Body";
    }
}
