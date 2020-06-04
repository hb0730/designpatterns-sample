package com.hb0730.design.patterns.singleton;

/**
 * 饿汉方式(线程安全)
 *
 *
 * @author bing_huang
 * @date 2020/06/04 10:43
 * @since V1.0
 */
public class Singleton1 {
    private static final Singleton1 uniqueInstance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return uniqueInstance;
    }
}
