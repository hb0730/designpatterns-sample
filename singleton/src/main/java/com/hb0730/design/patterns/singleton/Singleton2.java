package com.hb0730.design.patterns.singleton;

/**
 * 懒汉式
 *
 * @author bing_huang
 * @date 2020/06/04 10:55
 * @since V1.0
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {

    }

    /**
     * 没有加入synchronized关键字的版本是线程不安全的
     */
    public static Singleton2 getInstance1() {
        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }


    /**
     * 加入synchronized关键字
     */
    public static synchronized Singleton2 getInstance2() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

    /**
     * “双检锁/双重校验锁”
     */
    public static Singleton2 getInstance3() {
        //检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {
            //只有第一次才彻底执行这里的代码
            synchronized (Singleton2.class) {
                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }
}
