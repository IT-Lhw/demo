package working.baozi1;

import working.baozi1.BaoZi;

public class GuKe extends Thread {
    private BaoZi bz;

    public GuKe(BaoZi bz,String name) {
        super(name);
        this.bz = bz;
    }

    public GuKe() {
        super();
    }

    @Override
    public void run() {
//      创建死循环，让顾客一直吃包子
        while (true) {
            synchronized (bz) {
//            没有包子就等待，进入阻塞状态
                if (bz.ymy) {
                    System.out.println(Thread.currentThread().getName()+"开吃，吃包子" + bz.getPi() + bz.getXian() + "的包子真好吃！");
//                吃完包子唤醒老板让他在做
                    bz.ymy = false;
                    bz.notify();
                    System.out.println(Thread.currentThread().getName()+"老板，没包子了！");
                    System.out.println("-------------------------------");
                }
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
