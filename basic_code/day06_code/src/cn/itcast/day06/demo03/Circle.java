package cn.itcast.day06.demo03;

public class Circle {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public Circle() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void showArea(int r){
        System.out.println("半径为："+r+".面积为："+(3.14*r*r));
    }
    public void showPerimeter(int r){
        System.out.println("半径为："+r+"。周长为："+(6.28*r));
    }

}
