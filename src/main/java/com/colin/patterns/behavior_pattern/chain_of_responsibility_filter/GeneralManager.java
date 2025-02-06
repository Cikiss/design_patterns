package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;



// 具体过滤器——总经理
public class GeneralManager implements Filter {

    @Override
    public void doFilter(LeaveRequest request, FilterChain chain) {
        if (request.getNum() > 3 && request.getNum() <= 7){
            System.out.println("总经理已审批：" + request.getName() + "同学的请假条，" +
                    "请假天数为 " + request.getNum() + "天，原因：" + request.getContent());
        }else {
            System.out.println("请假天数过长，总经理不批准！");
        }
    }
}
