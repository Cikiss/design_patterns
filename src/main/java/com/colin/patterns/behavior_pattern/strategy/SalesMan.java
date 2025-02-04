package com.colin.patterns.behavior_pattern.strategy;


// 上下文
public class SalesMan {

    // 持有一个抽象策略接口
    private Strategy strategy;

    // 构造方法，传入一个具体策略对象
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    // 封装后的策略方法
    public void salesManShow() {
        strategy.show();
    }
}
