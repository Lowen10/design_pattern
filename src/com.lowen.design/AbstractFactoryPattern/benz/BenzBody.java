package com.lowen.design.AbstractFactoryPattern.benz;

import com.lowen.design.AbstractFactoryPattern.common.parts.Body;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:20 28/11/2018
 */
public class BenzBody implements Body {
    @Override
    public String description() {
        return "Benz Body";
    }
}
