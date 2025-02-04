package com.colin.patterns.structural_pattern.composite;

// 叶子节点——菜单项
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("菜单项：" + name);
    }
}
