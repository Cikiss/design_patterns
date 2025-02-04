package com.colin.patterns.creational_pattern.factory.config_abstract_factory;

// 意大利风味工厂——生产拿铁和提拉米苏
public class ItalianStyleFactory implements CoffeeDessertFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
