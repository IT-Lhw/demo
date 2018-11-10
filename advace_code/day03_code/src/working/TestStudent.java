package working;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestStudent {
    public static void main(String[] args) {
        HashSet<Student> sty = new HashSet<>();
        sty.add(new Student("lll",12));
        sty.add(new Student("lll",12));
        System.out.println(sty);
        LinkedHashSet<Integer> num = new LinkedHashSet<>();
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        System.out.println(num);
        System.out.println("==========");
        show(1,2,3,5,8,6,4,12,2,5,6,8,45);
        show1("天","天","向","上","好好","学习");


    }
    public static void show(int...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void show1(String...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
