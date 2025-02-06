package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;


// 具体过滤器——组长
public class GroupLeader implements Filter {
    @Override
    public void doFilter(LeaveRequest request, FilterChain chain) {
        if (request.getNum() > 0 && request.getNum() <= 1){
            System.out.println("组长已审批：" + request.getName() + "同学的请假条，" +
                    "请假天数为 " + request.getNum() + "天，原因：" + request.getContent());
        }else {
            chain.doFilter(request);
        }
    }
}
