package homework.homework01;

import homework.homework01.Animal;

public class Dog extends Animal {
    private String color;
    public Dog(int age, String name,String color) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃狗粮。");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
