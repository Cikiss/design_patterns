package com.colin.patterns.behavior_pattern.strategy;

// 具体策略——C
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("具体策略C");
    }
}
