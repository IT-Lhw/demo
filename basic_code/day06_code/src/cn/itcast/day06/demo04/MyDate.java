package cn.itcast.day06.demo04;
// 年月日；

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate(int year, int month, int day) {
        System.out.println("日期：" + year + "年" + month + "月" + day + "日");
    }

    public boolean isBi(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
