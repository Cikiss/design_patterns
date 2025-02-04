package com.colin.patterns.creational_pattern.singleton.hungry.static_block;

// 饿汉式（静态代码块）
public class Singleton {

    // 1. 私有化构造方法
    private Singleton(){}

    // 2. 创建一个静态对象
    private static Singleton instance;

    // 3. 在静态代码块中创建对象
    static {
        instance = new Singleton();
    }

    // 4. 提供获取对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
