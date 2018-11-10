package working;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        String str = "abcdefgabcdeaaaaabbcda";
        HashMap<Character, Integer> map = new HashMap<>();

        //遍历字符串

        for(int i=0; i<str.length(); i++){
            //取出字符
            char ch = str.charAt(i);
            //判断是否存在于集合中
            if(map.containsKey(ch)){
                //如果存在干什么事情
                Integer integer = map.get(ch);
                integer++;
                map.put(ch,integer );
            }else{
                //如果不存在干什么事情
                map.put(ch,1 );
            }

        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey()+"有"+entry.getValue()+"个。");
        }

    }

}
