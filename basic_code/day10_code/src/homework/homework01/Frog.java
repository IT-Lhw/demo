package homework.homework01;

public class Frog extends Animal implements YouYun {
    @Override
    public void eat() {
        System.out.println("青蛙吃小虫！");
    }

    @Override
    public void youYun() {
        System.out.println("青蛙会游泳！");
    }
}
