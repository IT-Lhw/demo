package working01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class Demo02 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("李");
//        list.add("元");
//        list.add("育");
//        list.add("泽");
//        list.add("真帅啊");
//        list.set(4, "魅力四射");
//        list.remove(0);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
        System.out.println();
        System.out.println("==================");
        LinkedList<String> str = new LinkedList<>();
        str.addFirst("first");
        str.addLast("last");
        System.out.println(str);
        String first = str.getFirst();
        System.out.println(first);
        String last = str.getLast();
        System.out.println(last);
        str.removeFirst();
        System.out.println(str);
        System.out.println("=============");


    }
}
