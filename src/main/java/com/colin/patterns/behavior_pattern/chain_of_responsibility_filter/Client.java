package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;


// 测试类
public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小李", 5, "结婚");

        // 创建一个过滤器链
        FilterChain chain = new FilterChain();
        chain.addFilter(new GroupLeader());
        chain.addFilter(new Manager());
        chain.addFilter(new GeneralManager());

        // 提交请求
        chain.doFilter(leave);

        System.out.println("--------------------------------------");

        chain.setIndex(0);
        leave = new LeaveRequest("小张", 2, "事假");
        chain.doFilter(leave);

        System.out.println("--------------------------------------");

        chain.setIndex(0);
        leave = new LeaveRequest("小红", 1, "事假");
        chain.doFilter(leave);
    }
}
