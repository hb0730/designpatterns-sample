package com.hb0730.design.patterns.abstractfactory;

import org.junit.Test;

public class PhoneFactoryTest {

    @Test
    public void test() {
        PhoneFactory factory = new IPhoneFactory();
        factory.produceCable().transmit();
        factory.produceCharger().charge();
        factory.producePhone().use();
        factory = new XiaomiFactory();
        factory.produceCable().transmit();
        factory.produceCharger().charge();
        factory.producePhone().use();
    }

}
