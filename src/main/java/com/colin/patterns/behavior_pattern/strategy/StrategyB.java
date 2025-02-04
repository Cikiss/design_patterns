package com.colin.patterns.behavior_pattern.strategy;

// 具体策略——B
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("具体策略B");
    }
}
