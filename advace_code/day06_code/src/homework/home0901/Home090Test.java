package homework.home0901;

public class Home090Test {
    public static void main(String[] args) {
        Home0901 go = new Home0901();
        new Thread(go, "熊大").start();
        new Thread(go, "熊二").start();
        new Thread(go, "熊三").start();
        new Thread(go, "熊四").start();
        new Thread(go, "熊五").start();
        new Thread(go, "熊六").start();
        new Thread(go, "熊七").start();
        new Thread(go, "熊八").start();
        new Thread(go, "熊九").start();
        new Thread(go, "熊老小").start();
    }
}
