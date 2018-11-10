package working.dome01;

import working.dome01.Animal;

public class Cat extends Animal {
    @Override
    public void eat (String name,String food){
        System.out.println(name+"吃"+food);
    }
}
