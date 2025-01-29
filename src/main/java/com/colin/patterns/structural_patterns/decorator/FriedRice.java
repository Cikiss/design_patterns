package com.colin.patterns.structural_patterns.decorator;

// 具体构建者
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "fried rice");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
