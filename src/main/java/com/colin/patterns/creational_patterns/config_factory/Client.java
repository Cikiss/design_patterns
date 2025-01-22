package com.colin.patterns.creational_patterns.config_factory;


// 客户端
public class Client {
    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.createCoffee("americano");
        System.out.println(americano.getName());
        System.out.println("-----------------------------------------");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
