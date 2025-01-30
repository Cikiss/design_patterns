package com.colin.patterns.structural_patterns.bridge;

// 抽象类
public abstract class OperatingSystem {

    // 保证子类可以访问，而外部类不能访问，提高封装性
    // 不用private是因为避免子类使用时要用getter/setter
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
