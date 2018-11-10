package homework.homework01;

public class Test {
    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        Dog dog = new Dog();
        dog.He();
        feeder.show(dog);
        Frog frog = new Frog();
        frog.He();
        feeder.show(frog);
        Sheep sheep = new Sheep();
        sheep.He();
        sheep.eat();
    }
}
