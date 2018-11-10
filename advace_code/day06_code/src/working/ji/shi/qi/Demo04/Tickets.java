package working.ji.shi.qi.Demo04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
    private static int tickets =100;
//    private Object lock = new Object();
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
//        买票窗口一直开启
        while(true){
            lock.lock();
            if(tickets>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票");
                    tickets--;
                    lock.lock();
                }

            }


        }
    }
    public static synchronized void sy(){


    }
}
