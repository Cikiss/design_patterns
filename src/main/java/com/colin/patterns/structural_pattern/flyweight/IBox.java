package com.colin.patterns.structural_pattern.flyweight;

// 具体享元角色——I
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
