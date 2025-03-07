package com.colin.patterns.creational_pattern.factory.factory_method;

// 具体工厂——美式工厂
public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
