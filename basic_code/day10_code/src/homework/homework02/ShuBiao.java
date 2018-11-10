package homework.homework02;

public class ShuBiao implements USB {
    @Override
    public void on() {
        System.out.println("开启鼠标");
    }

    @Override
    public void off() {
        System.out.println("关闭鼠标");
    }
}
