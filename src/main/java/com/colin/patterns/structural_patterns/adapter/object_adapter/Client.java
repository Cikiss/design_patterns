package com.colin.patterns.structural_patterns.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        String msg = computer.readSD(sdCard);
        System.out.println(msg);

        System.out.println("============================");

        String msg1 = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(msg1);
    }
}
