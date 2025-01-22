package com.colin.patterns.creational_patterns.factory_method;

// 客户端
public class Client {
    public static void main(String[] args) {

        // 1.创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2.设置工厂
        coffeeStore.setFactory(new AmericanoFactory());
//        coffeeStore.setFactory(new LatteFactory());

        // 3.点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());


    }
}
