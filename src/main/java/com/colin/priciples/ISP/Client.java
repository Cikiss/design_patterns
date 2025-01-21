package com.colin.priciples.ISP;

public class Client {
    public static void main(String[] args) {

        // 1.创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();

        // 2.调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("=================");

        // 1.创建itcast安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();

        // 2.调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
