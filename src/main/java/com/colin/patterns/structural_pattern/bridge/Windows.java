package com.colin.patterns.structural_pattern.bridge;

// 扩展抽象类——Windows
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
