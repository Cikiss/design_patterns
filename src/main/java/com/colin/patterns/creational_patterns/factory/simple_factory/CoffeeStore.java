package com.colin.patterns.creational_patterns.factory.simple_factory;

// 咖啡商店
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
