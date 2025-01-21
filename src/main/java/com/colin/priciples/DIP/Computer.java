package com.colin.priciples.DIP;

public class Computer {

    private HardDisk hardDisk;
    private CPU cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    // 运行计算机
    public void run() {
        System.out.println("计算机开始运行...");
        String data = hardDisk.get();
        System.out.println("从硬盘中获取数据：" + data);
        cpu.run();
        memory.save();
    }
}
