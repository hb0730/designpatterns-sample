package com.hb0730.design.patterns.builder;

/**
 * @author bing_huang
 * @date 2020/06/24 9:35
 * @since V1.0
 */
public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
