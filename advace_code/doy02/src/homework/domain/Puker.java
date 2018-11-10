package homework.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Puker {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        String[] arr = {"♣","♦","♥","♠"};
        String[] arr1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        list.add("大鬼");
        list.add("小鬼");
//        得到一副扑克牌
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr1.length; i1++) {
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder str = stringBuilder.append(arr[i]).append(arr1[i1]);
//                System.out.println(str);
                String str1 = str.toString();
                list.add(str1);
            }
        }
//        System.out.println(list);
//        洗牌
        Collections.shuffle(list);
//        发牌 创建三个玩家集合 创建一个放底牌的集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            if(i>=list.size()-3){
                list4.add(list.get(i));
            }
            if(i%3 == 0){
                list1.add(list.get(i));
            }
            if(i%3 == 1){
                list2.add(list.get(i));
            }
            if(i%3 == 2){
                list3.add(list.get(i));
            }
        }
        System.out.println("熊大"+list1);
        System.out.println("熊二"+list2);
        System.out.println("光头强"+list3);
        System.out.println();
        System.out.println("底牌"+list4);

    }
}
