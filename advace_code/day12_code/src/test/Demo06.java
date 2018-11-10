package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo06 {
        public static void main(String[] args) {
            String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
            List<String> d = method(array,s-> s.split(",")[0].length() == 4,s-> s.split(",")[1].equals("女"));
            System.out.println(d);
    }
    public static List<String> method(String[] arr, Predicate<String> pre01, Predicate<String> pre02){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre01.and(pre02).test(s)){
                list.add(s);
            }
        }
        return list;
    }
}
