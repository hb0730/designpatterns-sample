package com.hb0730.design.patterns.adaptor;

/**
 * @author bing_huang
 * @date 2020/06/24 10:07
 * @since V1.0
 */
public class Computer {
    protected String ppt = "My PPT report";
    public String transmitWithVGA() {
        return ppt;
    }
}
