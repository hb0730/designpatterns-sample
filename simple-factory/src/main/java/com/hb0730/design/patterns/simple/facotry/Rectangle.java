package com.hb0730.design.patterns.simple.facotry;

/**
 * 长方形
 *
 * @author bing_huang
 * @date 2020/06/04 11:25
 * @since V1.0
 */
public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
