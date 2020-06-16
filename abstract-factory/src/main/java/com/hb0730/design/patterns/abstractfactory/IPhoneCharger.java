package com.hb0730.design.patterns.abstractfactory;

/**
 * @author bing_huang
 * @date 2020/06/16 9:51
 * @since V1.0
 */
public class IPhoneCharger implements Charger {
    public void charge() {
        System.out.println("Charge with iPhone charger. ");
    }
}
