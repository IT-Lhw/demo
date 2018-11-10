package homework.home01;

public class Tickets implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
                }else {
                    break;
                }
            }
        }
    }
}
