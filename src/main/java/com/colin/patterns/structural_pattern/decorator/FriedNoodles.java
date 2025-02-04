package com.colin.patterns.structural_pattern.decorator;

// 具体构建者
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12, "fried noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
