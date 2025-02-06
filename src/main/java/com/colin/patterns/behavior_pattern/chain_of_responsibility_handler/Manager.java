package com.colin.patterns.behavior_pattern.chain_of_responsibility_handler;


// 具体处理者——经理
public class Manager extends Handler{

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println("经理已审批：" + leave.getName() + "同学的请假条，请假天数为：" + leave.getNum() + "天，请假原因为：" + leave.getContent());
    }
}
