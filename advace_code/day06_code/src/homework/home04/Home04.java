package homework.home04;

public class Home04 implements Runnable {
    @Override
    public void run() {
        System.out.println("子线程名字是"+Thread.currentThread().getName());
    }
}
