package com.colin.patterns.creational_patterns.config_abstract_factory;

// 客户端
public class Client {
    public static void main(String[] args) {
        // 通过工厂选择器获取具体工厂
        CoffeeDessertFactory factory = FactorySelector.getFactory();

        // 创建咖啡和甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        // 输出咖啡和甜品名称
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
