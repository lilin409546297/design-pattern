package com.pinnet.abstractFactory;

import com.pinnet.factory.Color;
import com.pinnet.factory.Shape;

/**
 * Funtion: 工厂生产者.
 * 理解:一个工厂可以折生产形状和颜色
 * 我们需要那样东西的时候，选择对应的工厂进行生产
 * 通过工厂生产出距离的东西
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factory) {
        if ("shapeFactory".equals(factory)) {
            return new ShapeFactory();
        } else if ("colorFactory".equals(factory)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        //1、获取工厂
        AbstractFactory shapeFactory = factoryProducer.getFactory("shapeFactory");
        AbstractFactory colorFactory = factoryProducer.getFactory("colorFactory");
        //2、生产商品
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");

        Color red = colorFactory.getColor("red");
        Color green = colorFactory.getColor("green");
        Color blue = colorFactory.getColor("blue");

        //3、自由装配
        rectangle.draw();
        square.draw();
        circle.draw();

        red.fill();
        green.fill();
        blue.fill();
    }
}
