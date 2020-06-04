package com.hb0730.design.patterns.simple.facotry;

/**
 * 圆形
 *
 * @author bing_huang
 * @date 2020/06/04 11:26
 * @since V1.0
 */
public class Circle implements Shape {
    public Circle() {
        System.out.println("Circle");
    }

    public void draw() {
        System.out.println("Draw Circle");
    }
}
