package com.colin.patterns.creational_pattern.factory.abstract_factory;


// 抽象工厂接口
public interface CoffeeDessertFactory {

    Coffee createCoffee();
    Dessert createDessert();
}
