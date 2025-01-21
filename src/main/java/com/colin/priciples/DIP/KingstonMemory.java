package com.colin.priciples.DIP;


// 金士顿内存条
public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("金士顿内存条");
    }
}
