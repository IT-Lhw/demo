package cn.itcast.day06.demo04;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate my = new MyDate(1900,1,1);
        my.showDate(my.getYear(),my.getMonth(),my.getDay());
        System.out.println(my.getYear()+"年是闰年吗？"+my.isBi(my.getYear()));
    }
}
