package com.hb0730.design.patterns.abstractfactory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:55
 * @since V1.0
 */
public class IPhoneFactory implements PhoneFactory {
    public Phone producePhone() {
        return new IPhone();
    }

    public Cable produceCable() {
        return new IPhoneCable();
    }

    public Charger produceCharger() {
        return new IPhoneCharger();
    }
}
