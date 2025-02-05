package com.colin.patterns.behavior_pattern.command;


import java.util.HashMap;
import java.util.Map;

// 订单类
public class Order {

    private int diningTable;
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDir;
    }

    public void setFood(String foodName, int num) {
        this.foodDir.put(foodName, num);
    }
}
