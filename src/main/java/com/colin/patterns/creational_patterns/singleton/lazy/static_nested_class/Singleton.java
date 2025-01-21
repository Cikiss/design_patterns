package com.colin.patterns.creational_patterns.singleton.lazy.static_nested_class;

// 懒汉式，静态内部类方式
public class Singleton {

    // 1.构造函数私有化，外部不能new
    private Singleton() {}

    // 2.创建静态内部类
    private static class SingletonHolder {
        // 3.创建静态变量，保存实例
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.定义一个静态方法，用于获取唯一实例
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
