package working.ThreadDemo01;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo02 {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        /*
        5S后开始第一次执行，之后每隔1S执行一次
         */
        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("李昱辰真瘦啊，多吃点腰子啊");
            }
        }, 5, 1, TimeUnit.SECONDS);
    }
}
