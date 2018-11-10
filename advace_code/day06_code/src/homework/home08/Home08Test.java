package homework.home08;

import javafx.css.StyleOrigin;

public class Home08Test {
    public static void main(String[] args) {
        new Thread("新线程"){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println("子线程"+i);
                }
            }
        }.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("主线程"+i);
        }
    }
}
