package com.colin.patterns.creational_patterns.prototype;

public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"同学：在2020学年第一学期中表现优秀，被评为三好学生。");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
