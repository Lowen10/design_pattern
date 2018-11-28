package com.lowen.design.AbstractFactoryPattern.common;

import com.lowen.design.AbstractFactoryPattern.common.parts.Body;
import com.lowen.design.AbstractFactoryPattern.common.parts.Chassis;
import com.lowen.design.AbstractFactoryPattern.common.parts.Electrical;
import com.lowen.design.AbstractFactoryPattern.common.parts.Engine;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:37 28/11/2018
 */
public interface PartsFactory {
    /**
     * 车身
     *
     * @return
     */
    Body body();

    /**
     * 电子系统
     *
     * @return
     */
    Electrical electrical();

    /**
     * 底盘
     *
     * @return
     */
    Chassis chassis();

    /**
     * 引擎
     *
     * @return
     */
    Engine engine();
}
