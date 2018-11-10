package working.LambadDemo;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了。");
            }
        },"线程一：").start();
        new Thread(()-> {

            System.out.println(Thread.currentThread().getName() + "新线程创建了。");

        },"线程二：").start();
    }
}
