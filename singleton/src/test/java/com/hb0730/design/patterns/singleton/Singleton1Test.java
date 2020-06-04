package com.hb0730.design.patterns.singleton;

import org.junit.Test;

public class Singleton1Test {

    @Test
    public void getInstance() {
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());

    }
}
