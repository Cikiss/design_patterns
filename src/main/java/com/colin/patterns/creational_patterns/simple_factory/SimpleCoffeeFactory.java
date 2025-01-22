package com.colin.patterns.creational_patterns.simple_factory;


// 简单工厂类
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equals(type)) {
            coffee = new Americano();
        } else if ("latte".equals(type)) {
            coffee = new Latte();
        }
        return coffee;
    }
}
