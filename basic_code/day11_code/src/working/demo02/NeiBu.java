package working.demo02;

public class NeiBu {
    int num = 100;
    public class Nei{
        int num = 10;
        public void num(){
            int num = 1;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(NeiBu.this.num);
        }
    }
}
