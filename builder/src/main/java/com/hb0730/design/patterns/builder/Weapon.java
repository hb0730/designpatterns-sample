package com.hb0730.design.patterns.builder;

/**
 * @author bing_huang
 * @date 2020/06/24 9:36
 * @since V1.0
 */
public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
