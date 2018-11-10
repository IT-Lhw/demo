package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class PoKer {
    public static void main(String[] args) {
        mothed();
    }

    private static void mothed() {
//        来一副扑克牌
        String[] color = {"♦","♣","♠","♥"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        HashMap<Integer, String> map = new HashMap<>();
        map.put(52,"大王" );
        map.put(53,"小王" );
        int num = 0;
        for (int i = 0; i < number.length; i++) {
            for (int i1 = 0; i1 < color.length; i1++) {
                map.put(num++,color[i1]+number[i] );
            }
        }
//        System.out.println(map);
//        洗牌，洗的是key（即牌对应的索引）。
        ArrayList<Integer> index = new ArrayList<>();
        Set<Integer> integers = map.keySet();
        for (Integer key : integers) {
            index.add(key);
        }
        Collections.shuffle(index);
//        System.out.println(index);
//        发牌，创建三个玩家集合，一个底牌集合用于存储牌。
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < index.size(); i++) {
            if (i>50){
                diPai.add(index.get(i));
            }
            if (i%3 == 0){
                play01.add(index.get(i));
            }
            if (i%3 == 1){
                play02.add(index.get(i));
            }
            if (i%3 == 2){
                play03.add(index.get(i));
            }
        }
//        System.out.println(play01);
//        System.out.println(play02);
//        System.out.println(play03);
//        System.out.println(diPai);
//        整理牌，按大小顺序给个玩家手中的扑克牌排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(diPai);
//        System.out.println(play01);
//        System.out.println(play02);
//        System.out.println(play03);
//        System.out.println(diPai);
//        看牌
        show("熊大",play01,map);
        show("熊二",play02,map);
        show("阿强",play03,map);
        show("底牌",diPai,map);
    }

    private static void show(String name,ArrayList<Integer> arr,HashMap<Integer,String> map) {
        System.out.print(name+": ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(map.get(arr.get(i))+" ");
        }
        System.out.println();
    }
}
