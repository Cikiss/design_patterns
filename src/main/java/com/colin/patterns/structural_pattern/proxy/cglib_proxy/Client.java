package com.colin.patterns.structural_pattern.proxy.cglib_proxy;



public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());
        TrainStation proxy = (TrainStation) proxyFactory.getProxyInstance();
        proxy.sell();
    }
}
