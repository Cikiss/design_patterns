package com.colin.patterns.creational_patterns.config_abstract_factory;


// 抽象工厂接口
public interface CoffeeDessertFactory {

    Coffee createCoffee();
    Dessert createDessert();
}
