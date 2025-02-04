package com.colin.patterns.creational_pattern.factory.factory_method;

// 抽象咖啡类
public abstract class Coffee {

    void addMilk() {
        System.out.println("加奶");
    }

    void addSugar() {
        System.out.println("加糖");
    }

    public abstract String getName();
}
