package com.colin.patterns.structural_pattern.flyweight;

// 客户端
public class Client {
    public static void main(String[] args) {

        // 1.获取享元工厂
        BoxFactory boxFactory = BoxFactory.getInstance();

        // 2.获取享元对象
        AbstractBox box1 = boxFactory.getBox("L");
        AbstractBox box2 = boxFactory.getBox("I");
        AbstractBox box3 = boxFactory.getBox("O");
        AbstractBox box4 = boxFactory.getBox("O");

        // 3.获取非享元对象并显示
        box1.display("red");
        box2.display("blue");
        box3.display("green");
        box4.display("yellow");

        // 4.验证享元对象是否共享
        System.out.println(box3 == box4);

    }
}
