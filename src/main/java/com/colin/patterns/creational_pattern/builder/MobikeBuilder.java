package com.colin.patterns.creational_pattern.builder;

// 具体建造者——建造摩拜单车对象
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() { bike.setFrame("铝合金车架"); }

    @Override
    public void buildSeat() { bike.setSeat("真皮车座"); }

    @Override
    public Bike createBike() {
        return bike;
    }
}
