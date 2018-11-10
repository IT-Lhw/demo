package working;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        List<Object> obj = List.of("T",":","y");
        System.out.println(obj);
        Set<String> set = Set.of("1");
        System.out.println(set);
        System.out.println("=========");
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
