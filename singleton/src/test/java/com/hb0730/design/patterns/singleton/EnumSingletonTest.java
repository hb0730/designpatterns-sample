package com.hb0730.design.patterns.singleton;

import org.junit.Test;

public class EnumSingletonTest {

    @Test
    public void test() {
        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
    }
}
