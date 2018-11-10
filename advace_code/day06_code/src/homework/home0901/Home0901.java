package homework.home0901;

public class Home0901 implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "第" + number++ + "个过洞。");
        }
    }
}
