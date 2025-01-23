package com.colin.patterns.creational_patterns.factory.factory_method;


// 咖啡商店
public class CoffeeStore {

    // 抽象工厂
    private CoffeeFactory factory;

    // 注入具体工厂
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
