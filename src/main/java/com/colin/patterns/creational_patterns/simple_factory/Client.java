package com.colin.patterns.creational_patterns.simple_factory;

// 客户端
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("americano");
//        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
