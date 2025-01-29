package com.colin.patterns.structural_patterns.decorator;

// 具体装饰者
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "egg");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " " + getFastFood().getDesc();
    }
}
