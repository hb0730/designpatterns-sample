package com.hb0730.design.patterns.adaptor;

/**
 * @author bing_huang
 * @date 2020/06/24 10:08
 * @since V1.0
 */
public class DisplayAdaptor implements DisplayRequire {
    private Computer computer;

    public DisplayAdaptor(Computer computer) {
        this.computer = computer;
    }

    public String transmitWithVGA() {
        return computer.transmitWithVGA();
    }

    public String transmitWithHDMI() {
        return computer.transmitWithVGA();
    }
}
