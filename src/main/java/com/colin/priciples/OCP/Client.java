package com.colin.priciples.OCP;

public class Client {
    public static void main(String[] args) {

        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();

        // 2.创建皮肤对象
//        AbstractSkin skin = new SupermanSpecificSkin();
        AbstractSkin skin = new DefaultSpecificSkin();

        // 3.设置皮肤
        input.setSkin(skin);

        // 4.显示皮肤
        input.display();
    }
}
