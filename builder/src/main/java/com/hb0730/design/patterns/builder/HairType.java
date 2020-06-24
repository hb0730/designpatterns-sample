package com.hb0730.design.patterns.builder;

/**
 * @author bing_huang
 * @date 2020/06/24 9:33
 * @since V1.0
 */
public enum HairType {
    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly"),
    ;
    private String title;

    HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
