package com.hb0730.design.patterns.abstractfactory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:56
 * @since V1.0
 */
public class XiaomiFactory implements PhoneFactory {
    public Phone producePhone() {
        return new XiaomiPhone();
    }

    public Cable produceCable() {
        return new AndroidCable();
    }

    public Charger produceCharger() {
        return new XiaomiCharger();
    }
}
