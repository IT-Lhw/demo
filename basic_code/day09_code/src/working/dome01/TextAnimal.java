package working.dome01;

import working.dome01.Cat;
import working.dome01.Dog;
import working.dome01.Pig;

public class TextAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("狗","骨头！");
        Cat cat = new Cat();
        cat.eat("猫","鱼！");
        Pig pig = new Pig();
        pig.eat("猪","饲料！");
    }
}
