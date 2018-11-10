package working.lockSi;

public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        synchronized (MyLock.LOCK_A){
            System.out.println("1线程获得了a锁");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyLock.LOCK_B){
                System.out.println("1线程获得了b锁");
            }
        }
    }
}
