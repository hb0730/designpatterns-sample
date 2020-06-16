package com.hb0730.design.patterns.abstractfactory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:52
 * @since V1.0
 */
public class AndroidCable implements Cable {
    public void transmit() {
        System.out.println("Transmit data or power with Android Cable. ");
    }
}
