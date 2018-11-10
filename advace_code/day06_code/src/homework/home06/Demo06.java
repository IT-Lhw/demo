package homework.home06;

public class Demo06 extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("子线程执行");
        }

    }
}
