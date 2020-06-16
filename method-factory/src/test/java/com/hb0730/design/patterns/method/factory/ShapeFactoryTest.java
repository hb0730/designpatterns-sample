package com.hb0730.design.patterns.method.factory;

import junit.framework.TestCase;
import org.junit.Test;


public class ShapeFactoryTest extends TestCase {

    @Test
    public void testGetShape() {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.getShape();
        shape.draw();

        factory = new RectangleFactory();
        factory.getShape().draw();

        factory = new TriangleFactory();
        factory.getShape().draw();
    }
}
