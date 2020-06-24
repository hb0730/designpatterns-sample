package com.hb0730.design.patterns.adaptor;

/**
 * @author bing_huang
 * @date 2020/06/24 10:07
 * @since V1.0
 */
public class AdvancedComputer extends Computer implements DisplayRequire {
    public String transmitWithHDMI() {
        return this.ppt;
    }
}
