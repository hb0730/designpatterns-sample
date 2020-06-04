package com.hb0730.design.patterns.singleton;

import junit.framework.TestCase;
import org.junit.Test;

public class Singleton2Test extends TestCase {

    @Test
    public void testGetInstance1() {
        System.out.println(Singleton2.getInstance1());
        System.out.println(Singleton2.getInstance1());
    }

    @Test
    public void testGetInstance2() {
        System.out.println(Singleton2.getInstance2());
        System.out.println(Singleton2.getInstance2());
    }

    @Test
    public void testGetInstance3() {
        System.out.println(Singleton2.getInstance3());
        System.out.println(Singleton2.getInstance3());
    }
}
