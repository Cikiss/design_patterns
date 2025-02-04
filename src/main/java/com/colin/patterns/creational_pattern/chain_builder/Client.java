package com.colin.patterns.creational_pattern.chain_builder;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("Intel Core i7")
                .memory("16GB")
                .screen("13.3\"")
                .mainboard("Intel HM")
                .build();

        System.out.println(phone);
    }
}
