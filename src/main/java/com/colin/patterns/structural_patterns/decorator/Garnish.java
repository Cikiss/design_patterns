package com.colin.patterns.structural_patterns.decorator;

// 抽象装饰者
public abstract class Garnish extends FastFood{

    // 持有一个快餐的引用
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
