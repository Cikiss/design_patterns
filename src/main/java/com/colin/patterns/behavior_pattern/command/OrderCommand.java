package com.colin.patterns.behavior_pattern.command;


import java.util.Map;

// 具体命令——点餐命令
public class OrderCommand implements Command{

    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("点餐命令：" + order.getDiningTable() + "桌点的菜单：");

        Map<String, Integer> foodDic = order.getFoodDic();
        if (foodDic != null) {
            for (Map.Entry<String, Integer> entry : foodDic.entrySet()){
                receiver.makeFood(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(order.getDiningTable() + "桌点餐完成！");
    }
}
