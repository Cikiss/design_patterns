package com.colin.patterns.creational_patterns.abstract_factory;

// 客户端
public class Client {
    public static void main(String[] args) {
        CoffeeDessertFactory factory = new AmericanStyleFactory();
//        CoffeeDessertFactory factory = new ItalianStyleFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
