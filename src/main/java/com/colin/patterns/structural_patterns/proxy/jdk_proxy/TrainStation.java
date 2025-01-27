package com.colin.patterns.structural_patterns.proxy.jdk_proxy;

// 真实主题——火车站
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
