package com.pinnet.factory;

import com.pinnet.factory.shapeImpl.Circle;
import com.pinnet.factory.shapeImpl.Rectangle;
import com.pinnet.factory.shapeImpl.Square;

/**
 * Funtion: 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象.
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 */
public class ShapeFactory {

    /**
     * 通过统一接口获取实现
     * @param shape
     * @return
     */
    public Shape getShape(String shape) {

        if ("rectangle".equals(shape)) {
            return new Rectangle();
        } else if ("square".equals(shape)) {
            return new Square();
        } else if ("circle".equals(shape)) {
            return new Circle();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
