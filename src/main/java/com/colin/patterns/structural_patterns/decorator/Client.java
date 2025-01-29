package com.colin.patterns.structural_patterns.decorator;

// 客户端
public class Client {
    public static void main(String[] args) {

        // 点一份炒饭
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + ":" + friedRice.cost());

        System.out.println("-----------------------------------------");

        // 加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + ":" + friedRice.cost());

        // 加一个培根
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + ":" + friedRice.cost());

        System.out.println("-----------------------------------------");

        // 再加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + ":" + friedRice.cost());
    }
}
