package com.colin.priciples.DIP;

// 硬盘接口
public interface HardDisk {

    // 存储数据
    void save(String data);
    // 获取数据
    String get();
}
