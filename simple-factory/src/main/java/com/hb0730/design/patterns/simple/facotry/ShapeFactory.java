package com.hb0730.design.patterns.simple.facotry;

/**
 * 工厂类
 *
 * @author bing_huang
 * @date 2020/06/04 11:27
 * @since V1.0
 */
public class ShapeFactory {
    // 使用 getShape 方法获取形状类型的对象
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
