package com.colin.patterns.creational_patterns.factory_method;

// 具体工厂——拿铁工厂
public class LatteFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
