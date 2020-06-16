package com.hb0730.design.method.factory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:20
 * @since V1.0
 */
public class TriangleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Triangle();
    }
}
