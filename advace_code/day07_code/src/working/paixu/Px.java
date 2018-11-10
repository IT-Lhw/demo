package working.paixu;

import java.util.ArrayList;
import java.util.Collections;

public class Px {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("atongmu",56));
        list.add(new Person("baby",30));
        list.add(new Person("cluo",31));
        list.add(new Person("dabao",30));

        Collections.sort(list, (Person p1, Person p2)-> {
                return p1.getAge() - p2.getAge();
            }
        );

        System.out.println(list);

    }
}
