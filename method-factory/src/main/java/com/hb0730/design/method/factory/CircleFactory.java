package com.hb0730.design.method.factory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:19
 * @since V1.0
 */
public class CircleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Circle();
    }
}
