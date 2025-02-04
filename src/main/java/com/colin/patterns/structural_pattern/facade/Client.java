package com.colin.patterns.structural_pattern.facade;


// 客户端类
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("-----------------------------------------");

        facade.say("关闭家电");
        System.out.println("-----------------------------------------");

        facade.say("shfsahf");
        System.out.println("-----------------------------------------");
    }
}
