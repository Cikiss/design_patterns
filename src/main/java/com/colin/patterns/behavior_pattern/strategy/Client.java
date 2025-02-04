package com.colin.patterns.behavior_pattern.strategy;


// 测试类
public class Client {
    public static void main(String[] args) {

        SalesMan salesManA = new SalesMan(new StrategyA());
        salesManA.salesManShow();

        System.out.println("--------------------------------");

        SalesMan salesManB = new SalesMan(new StrategyB());
        salesManB.salesManShow();

        System.out.println("--------------------------------");

        SalesMan salesManC = new SalesMan(new StrategyC());
        salesManC.salesManShow();
    }
}
