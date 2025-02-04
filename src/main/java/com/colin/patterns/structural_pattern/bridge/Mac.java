package com.colin.patterns.structural_pattern.bridge;

// 扩展抽象类——Mac
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
