package homework.homework01;

import homework.homework01.Dog;

public class Tast {
    public static void main(String[] args) {
//        测试构造方法
        Dog dog = new Dog(3, "旺财", "金色");
//        测试get方法
        String color = dog.getColor();
        System.out.println(color);
//        测试set方法
        dog.setColor("白色");
        System.out.println(dog.getColor());
//        测试子类复写父类的抽象方法
        dog.eat();
    }
}
