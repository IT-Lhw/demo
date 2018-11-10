package working.working02;

public class MainTste {
    public static void main(String[] args) {
        PrineThread thread = new PrineThread();
        thread.start();
        for(int i=0;i<20;i++){
            System.out.println("main:"+i);
        }
    }
}
