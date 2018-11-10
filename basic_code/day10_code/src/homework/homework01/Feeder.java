package homework.homework01;

public class Feeder {

    public void show(Animal animal){
        animal.eat();
        if (animal instanceof Dog){
            ((Dog) animal).youYun();
        }else if(animal instanceof Frog){
            ((Frog) animal).youYun();
        }
    }

}
