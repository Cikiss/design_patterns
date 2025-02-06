package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;



// 具体拦截器——经理
public class Manager implements Filter {
    @Override
    public void doFilter(LeaveRequest request, FilterChain chain) {
        if (request.getNum() > 1 && request.getNum() <= 3){
            System.out.println("经理已审批：" + request.getName() + "同学的请假条，" +
                    "请假天数为 " + request.getNum() + "天，原因：" + request.getContent());
        }else {
            chain.doFilter(request);
        }
    }
}
