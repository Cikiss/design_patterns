package com.colin.patterns.structural_pattern.proxy.jdk_proxy;

public class Client {

    public static void main(String[] args) {
        SellTickets proxyObject = (SellTickets) new ProxyFactory(new TrainStation()).getProxyObject();
        proxyObject.sell();
    }
}
