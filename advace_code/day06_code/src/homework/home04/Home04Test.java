package homework.home04;

public class Home04Test {
    public static void main(String[] args) {
        new Thread(new Home04()).start();
        System.out.println("主线程名字是："+Thread.currentThread().getName());
    }
}
