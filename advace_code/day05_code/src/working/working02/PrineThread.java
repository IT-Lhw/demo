package working.working02;

/**
 * java.lang.Thread类是描述线程的类，我们要想实现多线程，就必须继承Thread类
 * 实现步骤：
 * 1：创建一个Thread类的子类
 * 2：在Thread类的子类中重写run方法，设置线程任务
 * 3：创建一个Thread类的子类对象
 * 4：调用Thread类中的方法start方法，开启新的线程，执行run方法
 *
 */
public class PrineThread extends Thread {
//    设置线程任务
    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            System.out.println("run:"+i);
        }
    }
}
