package com.colin.patterns.behavior_pattern.command;


// 测试类
public class Client {
    public static void main(String[] args) {
        // 创建一个调用者对象——服务员
        Waiter invoke = new Waiter();

        // 创建1号订单
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 2);
        order1.setFood("宫保鸡丁", 1);

        // 创建2号订单
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("板面", 2);
        order2.setFood("九转大肠", 1);

        // 创建一个接收者对象——厨师
        SeniorChef receiver = new SeniorChef();

        // 创建一个命令对象，让同一个厨师做2个订单
        OrderCommand orderCommand1 = new OrderCommand(receiver, order1);
        OrderCommand orderCommand2 = new OrderCommand(receiver, order2);

        // 设置命令
        invoke.setCommand(orderCommand1);
        invoke.setCommand(orderCommand2);

        // 点菜
        invoke.orderUp();
    }
}
