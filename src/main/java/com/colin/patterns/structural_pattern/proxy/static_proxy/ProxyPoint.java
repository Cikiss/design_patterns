package com.colin.patterns.structural_pattern.proxy.static_proxy;

// 静态代理类——代售点
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些费用");
        trainStation.sell();
    }
}
