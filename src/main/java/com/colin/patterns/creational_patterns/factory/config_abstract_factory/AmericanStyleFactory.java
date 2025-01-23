package com.colin.patterns.creational_patterns.factory.config_abstract_factory;

// 美式风味工厂——生产美式咖啡和抹茶慕斯
public class AmericanStyleFactory implements CoffeeDessertFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
