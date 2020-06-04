package com.hb0730.design.patterns.simple.facotry;

/**
 * 正方形
 * @author bing_huang
 * @date 2020/06/04 11:26
 * @since V1.0
 */
public class Square implements Shape {
    public Square() {
        System.out.println("Square");
    }

    public void draw() {
        System.out.println("Draw Square");
    }
}
