package com.colin.patterns.structural_patterns.adapter.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD卡读取数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写入数据：" + msg);
    }
}
