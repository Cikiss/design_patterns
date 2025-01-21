package com.colin.priciples.DIP;

// 英特尔CPU
public class IntelCpu implements CPU{
    @Override
    public void run() {
        System.out.println("英特尔CPU运行");
    }
}
