package homework.homework03;

public class Worker extends Person {
    String unit;
    int workAge;

    @Override
    public void work(String name, String work) {
        System.out.println(name + "需要" + work);
    }

    public Worker() {
    }
}
