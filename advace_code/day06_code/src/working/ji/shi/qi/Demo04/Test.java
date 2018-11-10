package working.ji.shi.qi.Demo04;

public class Test {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        new Thread(tickets,"窗口一").start();
        new Thread(tickets,"窗口二").start();
        new Thread(tickets,"窗口三").start();
        new Thread(tickets,"窗口四").start();
    }
}
