package com.colin.patterns.structural_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂（静态内部类单例方式）
public class BoxFactory {

    // 享元对象池
    private Map<String, AbstractBox> boxes;

    // 私有化构造器
    private BoxFactory() {
        boxes = new HashMap<>();
        boxes.put("L", new LBox());
        boxes.put("I", new IBox());
        boxes.put("O", new OBox());
    }

    // 获取享元对象
    public AbstractBox getBox(String type) {
        return boxes.get(type);
    }

    // 创建静态内部类
    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    // 获取享元工厂实例
    public static BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
