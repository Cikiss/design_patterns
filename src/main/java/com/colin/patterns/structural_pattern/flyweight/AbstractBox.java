package com.colin.patterns.structural_pattern.flyweight;


// 享元角色
public abstract class AbstractBox {

    // 获取图形
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color){
        System.out.println("方块：" + getShape() + "，颜色：" + color);
    }
}
