package com.hb0730.design.method.factory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:18
 * @since V1.0
 */
public class RectangleFactory implements ShapeFactory {
    public Shape getShape() {
        return new Rectangle();
    }
}
