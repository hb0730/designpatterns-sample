package com.hb0730.design.patterns.simple.facotry;

import junit.framework.TestCase;
import org.junit.Test;

public class ShapeFactoryTest extends TestCase {

    @Test
    public void testGetShape() {
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
