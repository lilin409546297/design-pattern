package com.pinnet.abstractFactory;

import com.pinnet.factory.Color;
import com.pinnet.factory.Shape;
import com.pinnet.factory.colorImpl.Blue;
import com.pinnet.factory.colorImpl.Green;
import com.pinnet.factory.colorImpl.Red;

public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
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
