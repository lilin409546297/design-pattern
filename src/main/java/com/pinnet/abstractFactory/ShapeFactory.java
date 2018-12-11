package com.pinnet.abstractFactory;

import com.pinnet.factory.Color;
import com.pinnet.factory.Shape;
import com.pinnet.factory.shapeImpl.Circle;
import com.pinnet.factory.shapeImpl.Rectangle;
import com.pinnet.factory.shapeImpl.Square;

public class ShapeFactory extends AbstractFactory {

    /**
     * 通过统一接口获取实现
     * @param shape
     * @return
     */
    @Override
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

    @Override
    public Color getColor(String color) {
        return null;
    }

}
