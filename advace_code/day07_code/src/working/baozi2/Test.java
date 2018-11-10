package working.baozi2;

public class Test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new BaoZiPu(bz).start();
        new GuKe(bz).start();
    }
}
