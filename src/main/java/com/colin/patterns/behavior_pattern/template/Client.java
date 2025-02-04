package com.colin.patterns.behavior_pattern.template;

// 客户端
public class Client {
    public static void main(String[] args) {

        AbstractClass baoCai = new BaoCai();
        baoCai.cookProcess();

        System.out.println("---------------------------------------------");

        AbstractClass caiXin = new CaiXin();
        caiXin.cookProcess();
    }
}
