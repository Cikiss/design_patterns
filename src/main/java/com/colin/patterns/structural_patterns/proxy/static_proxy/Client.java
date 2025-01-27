package com.colin.patterns.structural_patterns.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
