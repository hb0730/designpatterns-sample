package com.hb0730.design.patterns.singleton;

/**
 * 懒汉式<br>
 *
 * 登记式/静态内部类
 *
 * @author bing_huang
 * @date 2020/06/04 11:00
 * @since V1.0
 */
public class Singleton3 {
    private static class SingleHandler {
        private final static Singleton3 instance = new Singleton3();
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        return SingleHandler.instance;
    }
}
