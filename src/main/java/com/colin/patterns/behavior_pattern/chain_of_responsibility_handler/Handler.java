package com.colin.patterns.behavior_pattern.chain_of_responsibility_handler;


// 抽象处理者——Handler
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;
    private int numStart;
    private int numEnd;

    @Override
    public String toString() {
        return "Handler{" +
                "numStart=" + numStart +
                ", numEnd=" + numEnd +
                ", nextHandler=" + nextHandler +
                '}';
    }

    protected Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler(int numStart){
        this.numStart = numStart;
    }

    // 设置下一个处理者——上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 当前处理者处理请假请求
    protected abstract void handleLeave(LeaveRequest leave);

    // 提交请假条
    public final void submit(LeaveRequest leave) {
        // 判断请假条的请假天数是否在当前处理者能够处理的范围内
        if (leave.getNum() >= this.numStart && leave.getNum() <= this.numEnd) {
            // 在，当前处理者处理请假条
            this.handleLeave(leave);
        } else if (this.nextHandler != null){
            // 不在，提交给下一个处理者——上级领导
            this.nextHandler.submit(leave);
        } else {
            // 已经没有下一个处理者了，无法处理
            System.out.println("无法处理");
        }
    }
}
