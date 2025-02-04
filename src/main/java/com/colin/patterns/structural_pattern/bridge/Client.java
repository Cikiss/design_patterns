package com.colin.patterns.structural_pattern.bridge;

public class Client {
    public static void main(String[] args) {
        VideoFile videoFile = new AVIFile();
        OperatingSystem operatingSystem = new Windows(videoFile);
        operatingSystem.play("test.avi");

        System.out.println("-----------------------------------------");

        videoFile = new RMVBFile();
        operatingSystem = new Mac(videoFile);
        operatingSystem.play("test.rmvb");
    }
}
