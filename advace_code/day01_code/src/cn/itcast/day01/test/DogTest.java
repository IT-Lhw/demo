package cn.itcast.day01.test;

import cn.itcast.day01.domain.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("二哈",3);
        Dog dog1 = new Dog("二哈",3);
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(dog1.equals(dog));
        long time = System.currentTimeMillis();
        System.out.println(time);

    }
}
