package com.colin.patterns.structural_pattern.adapter.class_adapter;

// 适配器类
public class SDAdapterTF extends TFCardImpl implements SDCard{

    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return this.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        this.writeTF(msg);
    }
}
