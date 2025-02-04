package com.colin.patterns.creational_pattern.singleton.lazy.syn;

// 懒汉式，同步式，线程安全
public class Singleton {

    // 1. 私有化构造方法
    private Singleton() {}

    // 2. 定义一个静态变量，用于存储
    private static Singleton instance;

    // 3. 定义一个静态方法，用于获取唯一实例
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
