package homework.homework02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1 );
            }else {
                map.put(ch,1 );
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
