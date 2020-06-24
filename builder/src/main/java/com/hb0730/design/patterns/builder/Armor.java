package com.hb0730.design.patterns.builder;

/**
 * @author bing_huang
 * @date 2020/06/24 9:36
 * @since V1.0
 */
public enum  Armor {
    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");
    private String title;
    Armor(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
