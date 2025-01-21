package com.colin.priciples.LCP;

public class RectangleDemo {

    public static void main(String[] args) {

        // 1.创建长方形对象
        Rectangle rectangle = new Rectangle();

        // 2.设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);

        // 3.调用扩宽方法
        resize(rectangle);

        // 4.打印长和宽
        printLengthAndWidth(rectangle);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle){
        while (rectangle.getLength() >= rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println("长：" + quadrilateral.getLength() + " 宽：" + quadrilateral.getWidth());
    }

}
