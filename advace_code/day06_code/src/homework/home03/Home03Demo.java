package homework.home03;

public class Home03Demo extends Thread {
    @Override
    public void run() {
        System.out.println("子线程名字是"+Thread.currentThread().getName());
    }
}
