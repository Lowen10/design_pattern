package com.lowen.design.AbstractFactoryPattern.common;

import com.lowen.design.AbstractFactoryPattern.common.parts.Body;
import com.lowen.design.AbstractFactoryPattern.common.parts.Chassis;
import com.lowen.design.AbstractFactoryPattern.common.parts.Electrical;
import com.lowen.design.AbstractFactoryPattern.common.parts.Engine;

/**
 * @Author ：Lowen
 * @Date ：Created in 10:25 28/11/2018
 */
public abstract class Car {

    protected String brand;
    protected Chassis chassis;
    protected Body body;
    protected Engine engine;
    protected Electrical electrical;

    public void prepare() {
        System.out.println("=== Start create a " + brand + " Car ===");
    }

    public void chassis() {
        System.out.println("Creating " + chassis.description());
    }

    public void body() {
        System.out.println("Creating " + body.description());
    }

    public void engine() {
        System.out.println("Creating " + engine.description());
    }

    public void electrical() {
        System.out.println("Creating " + electrical.description());
    }

    public void finish() {
        System.out.println("=== The birth of a new " + brand + "Car ===");
    }

    public void run() {
        System.out.println("Hello, I'm a new " + brand + " Car.");
        System.out.println();
    }

}
