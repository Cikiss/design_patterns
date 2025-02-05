package com.colin.patterns.behavior_pattern.command;


import java.util.ArrayList;

// 调用者——服务员
public class Waiter {
    private ArrayList<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    public void orderUp(){

        System.out.println("美女服务员：客人点菜完毕，开始通知厨子做菜-----");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
