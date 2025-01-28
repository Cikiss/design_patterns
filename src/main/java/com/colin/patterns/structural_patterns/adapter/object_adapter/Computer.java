package com.colin.patterns.structural_patterns.adapter.object_adapter;


public class Computer {

    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }
        return sdCard.readSD();
    }
}
