package working01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Dome01 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("ab");
        lists.add("abc");
        lists.add("abcd");
        String[] arr = lists.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        Integer[] arr1 = obj.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));
//        迭代器
        Iterator<String> iter = lists.iterator();
        while(iter.hasNext()){
            String str2 = iter.next();
            System.out.println(str2);
        }
        Iterator<Object> iterator = obj.iterator();
        while (iterator.hasNext()){
            Object num = iterator.next();
            System.out.println(num);
        }
        System.out.println("===========");
//        增强for循环
        for(String str:lists){
            System.out.println(str);
        }
    }
}
