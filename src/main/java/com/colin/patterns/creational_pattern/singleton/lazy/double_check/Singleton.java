package com.colin.patterns.creational_pattern.singleton.lazy.double_check;

// 懒汉式，双重检查锁方式
public class Singleton {

    // 1. 私有化构造方法
    private Singleton() {}

    // 2. 定义一个静态变量，用于存储实例，volatile保证可见性与有序性，避免指令重排
    private static volatile Singleton instance;

    // 3. 定义一个静态方法，用于获取唯一实例
    public static Singleton getInstance() {
        // 1.第一次判断，如果instance的值为null，则进入同步代码块
        if (instance == null) {
            // 2.同步代码块，保证线程安全
            synchronized (Singleton.class) {
                // 3.第二次判断，如果instance的值为null，则创建实例
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
