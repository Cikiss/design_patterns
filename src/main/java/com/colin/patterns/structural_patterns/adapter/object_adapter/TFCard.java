package com.colin.patterns.structural_patterns.adapter.object_adapter;

// 被适配者接口
public interface TFCard {
    String readTF();
    void writeTF(String msg);
}
