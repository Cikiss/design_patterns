package com.colin.patterns.structural_patterns.bridge;

// 具体实现类——RMVB格式
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB格式文件" + fileName);
    }
}
