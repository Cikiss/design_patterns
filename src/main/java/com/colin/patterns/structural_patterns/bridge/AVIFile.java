package com.colin.patterns.structural_patterns.bridge;

// 具体实现类——AVI格式
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI格式文件" + fileName);
    }
}
