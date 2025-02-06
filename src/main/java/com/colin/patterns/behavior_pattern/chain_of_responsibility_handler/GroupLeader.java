package com.colin.patterns.behavior_pattern.chain_of_responsibility_handler;


// 具体处理者——组长
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        
        System.out.println("组长已审批：" + leave.getName() + "同学的请假条，请假天数为" + leave.getNum() + "天，请假原因为：" + leave.getContent());
    }
}
