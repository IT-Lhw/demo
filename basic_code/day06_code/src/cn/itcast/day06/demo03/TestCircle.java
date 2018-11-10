package cn.itcast.day06.demo03;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("请输入圆的半径");
        int num = sc.nextInt();
        c.setR(num);
        System.out.println("半径为"+c.getR());
        c.showArea(num);
        c.showPerimeter(num);
    }
}
