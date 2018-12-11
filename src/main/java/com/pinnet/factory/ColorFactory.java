package com.pinnet.factory;

import com.pinnet.factory.colorImpl.Blue;
import com.pinnet.factory.colorImpl.Green;
import com.pinnet.factory.colorImpl.Red;

/**
 * Funtion: 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象.
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 */
public class ColorFactory {

    public Color getColor(String color) {
        if ("red".equals(color)) {
            return new Red();
        } else if ("green".equals(color)) {
            return new Green();
        } else if ("blue".equals(color)) {
            return new Blue();
        } else {
            return null;
        }
    }
}
