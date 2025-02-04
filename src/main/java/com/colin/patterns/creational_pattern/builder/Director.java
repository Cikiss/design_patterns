package com.colin.patterns.creational_pattern.builder;

// 指导者
public class Director {

    // 持有一个builder
    private Builder builder;

    // 构造函数
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
