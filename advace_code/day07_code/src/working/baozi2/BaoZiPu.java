package working.baozi2;

public class BaoZiPu extends Thread {
    private Baozi bz;
    int value = 0;

    public BaoZiPu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.isYmy() == false) {
                    if (value % 2 == 0) {
                        bz.setPi("薄皮儿");
                        bz.setXian("酸菜肉馅儿");
                        value++;
                    } else if (value % 2 == 1) {
                        bz.setPi("冰皮儿");
                        bz.setXian("猪肉大葱馅儿");
                        value++;
                    }
                    System.out.println("包子铺老板：开始做包子喽!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子铺老板：" + bz.getPi() + bz.getXian() + "的包子出锅喽。");
                    bz.setYmy(true);
                    bz.notify();
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
