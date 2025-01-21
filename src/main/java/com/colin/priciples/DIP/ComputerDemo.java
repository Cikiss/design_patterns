package com.colin.priciples.DIP;

public class ComputerDemo {

    public static void main(String[] args) {

        // 1.创建计算机对象
        Computer computer = new Computer();

        // 2.创建计算机组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        CPU cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        // 3.设置计算机组件
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        // 4.运行计算机
        computer.run();
    }
}
