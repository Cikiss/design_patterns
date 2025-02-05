package com.colin.patterns.behavior_pattern.command;


// 接收者——厨师
public class SeniorChef {

    public void makeFood(String foodName, int num){
        System.out.println(num + "份" + foodName);
    }
}
