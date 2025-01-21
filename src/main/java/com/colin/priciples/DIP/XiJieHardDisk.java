package com.colin.priciples.DIP;

// 希捷硬盘
public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("希捷硬盘保存数据为：" + data);
    }

    @Override
    public String get() {
        System.out.println("希捷硬盘读取数据");
        return "数据";
    }
}
