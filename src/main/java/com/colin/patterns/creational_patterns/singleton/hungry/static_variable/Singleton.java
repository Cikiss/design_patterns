package com.colin.patterns.creational_patterns.singleton.hungry.static_variable;


// 饿汉式（静态变量）
public class Singleton {

    // 1. 私有化构造方法
    private Singleton() {}

    // 2. 创建一个静态变量，保存实例
    private static final Singleton instance = new Singleton();

    // 3. 提供一个公共的静态方法获取实例
    public static Singleton getInstance() {
        return instance;
    }
}
