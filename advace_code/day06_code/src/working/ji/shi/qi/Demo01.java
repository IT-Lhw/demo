package working.ji.shi.qi;

public class Demo01 {
    public static void main(String[] args) {
        JiShiQI ji = new JiShiQI();
        ji.start();
        new Thread(){
            @Override
            public void run() {
                for(int i = 0;i<=10;i++){
                    System.out.println(i+"yyy");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
