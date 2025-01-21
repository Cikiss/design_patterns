package com.colin.patterns.structural_patterns.facade;


import com.colin.patterns.structural_patterns.facade.sub_system.AirCondition;
import com.colin.patterns.structural_patterns.facade.sub_system.Light;
import com.colin.patterns.structural_patterns.facade.sub_system.TV;

// 外观类，封装了子系统的功能
public class SmartAppliancesFacade {
    private TV tv;
    private AirCondition airCondition;
    private Light light;
    public SmartAppliancesFacade() {
        tv = new TV();
        airCondition = new AirCondition();
        light = new Light();
    }

    public void say(String message){
        if(message.contains("打开")){
            allOn();
        }else if(message.contains("关闭")){
            allOff();
        }else{
            System.out.println("没有这个指令");
        }
    }

    public void allOn() {
        tv.on();
        airCondition.on();
        light.on();
    }

    public void allOff() {
        tv.off();
        airCondition.off();
        light.off();
    }

}
