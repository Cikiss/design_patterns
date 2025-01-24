package com.colin.patterns.creational_patterns.builder;


// 客户端
public class Client {
    public static void main(String[] args) {

        // 创建建造者对象
//        Builder builder = new MobikeBuilder();
        Builder builder = new OfoBuilder();

        // 创建指挥者对象并指挥建造者对象
        Director director = new Director(builder);
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
