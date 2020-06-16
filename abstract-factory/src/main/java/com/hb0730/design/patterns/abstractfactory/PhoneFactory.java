package com.hb0730.design.patterns.abstractfactory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:44
 * @since V1.0
 */
public interface PhoneFactory {
    Phone producePhone();

    Cable produceCable();

    Charger produceCharger();
}
