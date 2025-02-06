package com.colin.patterns.behavior_pattern.chain_of_responsibility_handler;


// 测试类
public class Client {
    public static void main(String[] args) {
        // 请假条
        LeaveRequest leave = new LeaveRequest("小明", 5, "事假");

        // 创建所有处理者
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();

        // 组装处理者成链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        System.out.println(groupLeader);
        System.out.println(manager);
        System.out.println(generalManager);

        // 调用处理者的submit方法，提交请假条
        groupLeader.submit(leave);

        System.out.println("--------------------------------------");

        leave = new LeaveRequest("小红", 1, "事假");
        groupLeader.submit(leave);

        System.out.println("--------------------------------------");

        leave = new LeaveRequest("小张", 2, "事假");
        groupLeader.submit(leave);

    }
}
